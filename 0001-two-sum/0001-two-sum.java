class Solution {
    public int[] twoSum(int[] a, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int t = target - a[i];
            if(map.containsKey(t)){
                return new int[]{i,map.get(t)};
            }
            map.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
}