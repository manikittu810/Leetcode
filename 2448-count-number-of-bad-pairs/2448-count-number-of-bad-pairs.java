class Solution {
    public long countBadPairs(int[] a) {
        long goodPairs = 0;
        long n = a.length;
        long allPairs = n*(n-1)/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            int key = i-a[i];

            goodPairs+=map.getOrDefault(key,0);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        long badPairs = allPairs - goodPairs;
        return badPairs;
    }
}