class Solution {
    public boolean canArrange(int[] a, int k) {
        int n = a.length;
        int freqArray[] = new int[k];
        int count = 0;
        for(int i:a){
            int rem =  ((i%k)+k)%k;
            freqArray[rem]++;

            // this basically makes any -ve number into +ve
        }
        if(freqArray[0]%2!=0){
            return false;
        }
        for(int i=1;i<=k/2;i++){
            int complimentary = k-i;
            if(freqArray[i]!=freqArray[complimentary]){
                return false;
            }
        }
        return true;
    }
}