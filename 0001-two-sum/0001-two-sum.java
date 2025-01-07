class Solution {
    public int[] twoSum(int[] a, int t) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int n= t-a[i];
             if(map.containsKey(n)){
                return new int[]{i,map.get(n)};
            }
            map.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
}