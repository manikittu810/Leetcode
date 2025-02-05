class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
       if(s1.equals(s2)) return true;

       List<Integer> diffIndexStore = new ArrayList<>();

       for(int i =0;i<s1.length();i++){
        if(s1.charAt(i)==s2.charAt(i)) continue;
        else{
            diffIndexStore.add(i);
        }
       }
       if(diffIndexStore.size() == 2){
        int i = diffIndexStore.get(0);
        int j = diffIndexStore.get(1);

        return (s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i));
       }
       return false;
    }
}