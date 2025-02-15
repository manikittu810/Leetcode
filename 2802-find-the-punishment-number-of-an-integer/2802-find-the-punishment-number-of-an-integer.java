class Solution {
    public int punishmentNumber(int n) {
        int total = 0;
        for(int i=1;i<=n;i++){
            int square = i*i;
            String s = Integer.toString(square);
            if(backTrack(s,0,0,i)){
                total+=square;
            }
        }
        return total;
    }
    private boolean backTrack(String s, int index, int curSum, int target){
        if(index == s.length()){
            return curSum == target;
        }
        int sum = 0;
        for(int j=index;j<s.length();j++){
            sum = sum*10+(s.charAt(j)-'0');
            if(sum+curSum > target){break;}
            if(backTrack(s,j+1,sum+curSum,target)){
                return true;
            }
        }
        return false;
    }
}