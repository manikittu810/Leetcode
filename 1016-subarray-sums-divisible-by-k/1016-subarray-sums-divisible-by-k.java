class Solution {
    public int subarraysDivByK(int[] a, int k) {
        int []prefixSum = new int[a.length+1];
        for(int i=0;i<a.length;i++){
            prefixSum[i+1] = prefixSum[i]+a[i];
        }
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=1;i<prefixSum.length;i++){
            int remainder = prefixSum[i]%k;
            if(remainder<0){
                remainder+=k;
            }
            if(map.containsKey(remainder)){
                 count+=map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}