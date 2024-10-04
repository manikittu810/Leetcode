class Solution {
    public int[] twoSum(int[] a, int t) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],i);
        }

        for(int i=0;i<a.length;i++){
            if(map.containsKey(t-a[i]) && map.get(t-a[i])!=i){
                return new int[] {i,map.get(t-a[i])};
            }
        }
        return new int[]{-1,-1};
    }
}