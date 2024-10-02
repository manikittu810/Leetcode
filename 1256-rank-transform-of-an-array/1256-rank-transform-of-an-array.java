class Solution {
    public int[] arrayRankTransform(int[] a) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        for(int i:a){
            set.add(i);
        }
            int rank =1;

            for(int i : set){
                map.put(i,rank);
                rank++;
            }
        for(int i=0;i<a.length;i++){
            int n = map.get(a[i]);
            a[i] = n;
        }
        return a;
    }
}