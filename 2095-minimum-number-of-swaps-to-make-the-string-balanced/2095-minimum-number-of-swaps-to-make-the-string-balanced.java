class Solution {
    public int minSwaps(String s) {
    int balance=0;
    int swaps = 0;
        for(Character c : s.toCharArray()){
            if(c == '['){
                balance++;
            }else{
                balance--;
            }
            
            if(balance < 0){
                swaps++;
                balance = 0;
            }
        }
        return (swaps+1)/2;
    }
}