class Solution {
    public long dividePlayers(int[] a) {

        if(a.length%2!=0){
            return -1;
        }
        Arrays.sort(a);//n log n

        int l=0,r=a.length-1;
        long sum=0, chem=0;

        Map<long[],Long> map = new HashMap<>();//O(n) space

        while(l<r){//O(n) tc
        long []b = new long[2];
            sum=0;
            b[0]=a[l];
            b[1]=a[r];
            l++;
            r--;
            sum = b[0]+b[1];
            map.put(b,sum);
        }
        for(Map.Entry<long[],Long> entry : map.entrySet()){//O(n)
            long v = entry.getValue();
            if(v!=sum){
                return -1;
            }
            else{
                long []key = entry.getKey();
                // for(int i=0;i<2;i++){
                //     System.out.print(key[i] + " ");
                // }
                // System.out.print(" : "+v);
                long []c = new long[2];
                c[0] = key[0];
                c[1] = key[1];
                chem+= c[0]*c[1];
            }
            // System.out.println();
        }
        return chem;
    }
}