class Solution {
    public int fillCups(int[] a) {
        int c = 0;
        while(true){
            Arrays.sort(a);
            if(a[2] == 0){
                break;
            }

            if(a[1]>0){
                a[1]--;
                a[2]--;
            }
            else{
                a[2]--;
            }
            c++;
        }
        return c;
        
    }
}