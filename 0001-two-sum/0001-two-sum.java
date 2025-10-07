class Solution {
    public int[] twoSum(int[] a, int t) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int z = t-a[i];
            if(map.containsKey(z)){
                return new int[]{map.get(z),i};
            }
            map.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
}