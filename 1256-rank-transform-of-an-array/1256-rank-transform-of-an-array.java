class Solution {
    public int[] arrayRankTransform(int[] a) {
        Map<Integer,Integer> map = new HashMap<>();

        int[] b = Arrays.copyOf(a,a.length);

        Arrays.sort(b);

        int rank = 1;

        for(int i=0;i<b.length;i++){
            if(i>0 && b[i]>b[i-1]){
                rank++;
            }
            map.put(b[i],rank);
        }
        for(int i=0;i<a.length;i++){
            int n = map.get(a[i]);
            a[i] = n;
        }
return a;
    }
}