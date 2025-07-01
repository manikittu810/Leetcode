class Solution {
    public boolean containsDuplicate(int[] a) {
        if(a.length == 1){
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for(int i : a){
            if(!set.contains(i)){
                set.add(i);
            }else{
                return true;
            }
        }
        return false;
    }
}