class Solution {
    public int[] applyOperations(int[] a) {
        int count = a.length-1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                a[i] = a[i]*2;
                a[i+1] = 0;
            }
        }
       int idx =0;
       for(int i=0;i<a.length;i++){
        if(a[i]!=0){
        a[idx++] = a[i];
        }
       }
        while(idx < a.length){
            a[idx++] = 0;
        }            
        
        
        return a;
    }
}