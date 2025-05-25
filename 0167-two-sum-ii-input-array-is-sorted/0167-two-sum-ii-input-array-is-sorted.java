class Solution {
    public int[] twoSum(int[] a, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int targetSum = target-a[i];// 9-2 = 7
            if(map.containsKey(targetSum)){
                return new int[]{map.get(targetSum)+1,i+1};
            }
            map.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
}