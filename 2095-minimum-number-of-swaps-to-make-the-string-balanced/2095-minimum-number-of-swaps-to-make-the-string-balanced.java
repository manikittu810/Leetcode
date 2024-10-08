class Solution {
    public int minSwaps(String s) {
    int n = 0;
    for(int i =0;i<s.length();i++){
        if(s.charAt(i) == '['){
            n++;
        }
        else{
            if(n>0){
            n--;
            }
        }
    }
    return (n+1)/2;
    }
}