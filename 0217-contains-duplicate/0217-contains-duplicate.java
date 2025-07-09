class Solution {
    public boolean containsDuplicate(int[] a) {
        if(a.length==1){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int i : a){
            if(set.contains(i)){
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }
}