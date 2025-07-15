class Solution {
    public int findDuplicate(int[] a) {
        int fptr = 0;
        int sptr = 0;
        do{
            sptr = a[sptr];
            fptr = a[a[fptr]];
        }while(sptr!=fptr);
        sptr = 0;
        while(sptr!=fptr){
            sptr = a[sptr];
            fptr = a[fptr];
        }
        return sptr;
    }
}