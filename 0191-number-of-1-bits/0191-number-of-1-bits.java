class Solution {
    public int hammingWeight(int n) {
        int count =0;
        for(int i=0;i<32;i++){
            if(checkBit(n,i)){
                count++;
            }
        }
        return count;
    }
    boolean checkBit(int n,int i){
        if((n&(1<<i))!=0){
            return true;
        }
        return false;
    }
}
