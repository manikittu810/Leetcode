class Solution {
    public int[] twoSum(int[] a, int tar) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<a.length;i++){

            int t = tar-a[i];

            if(map.containsKey(t)){
                return new int[]{i,map.get(t)};
            }else{
            map.put(a[i],i);

            }
        }
        return new int[]{-1,-1};
    }
}