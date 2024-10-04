class Solution {
    public int subarraySum(int[] a, int k) {
        int []prefixSum = new int[a.length+1];
        for(int i=0;i<a.length;i++){
            prefixSum[i+1] = prefixSum[i]+a[i];
        }        

        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<prefixSum.length;i++){
            if(map.containsKey(prefixSum[i] - k)){
                count+=map.get(prefixSum[i]-k);
            }
            map.put(prefixSum[i],map.getOrDefault(prefixSum[i],0)+1);
        }
    return count;
    }
}