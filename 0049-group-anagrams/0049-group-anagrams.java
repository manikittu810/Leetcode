class Solution {
    public List<List<String>> groupAnagrams(String[] a) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            String s1 = a[i];//eat
            char[] c = s1.toCharArray();//e,a,t
            Arrays.sort(c);//a,e,t
            s1 = new String(c);//aet
            if(!map.containsKey(s1)){
                map.put(s1,new ArrayList<>());
            }
            map.get(s1).add(a[i]);
        }
        return new ArrayList<>(map.values());
    }
}