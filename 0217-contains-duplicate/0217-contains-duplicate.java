class Solution {
    public boolean containsDuplicate(int[] a) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            if(!map.containsKey(i)){
                map.put(i,map.getOrDefault(i,0)+1);
            }else{
                return true;
            }
         }
         return false;
    }
}