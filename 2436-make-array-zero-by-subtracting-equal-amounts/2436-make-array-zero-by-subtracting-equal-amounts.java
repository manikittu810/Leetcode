class Solution {
    public int minimumOperations(int[] a) {
        Set<Integer> set = new HashSet<>();
        for(int i : a){
            if(i!=0){
                set.add(i);
            }
        }        
        return set.size();
    }
}