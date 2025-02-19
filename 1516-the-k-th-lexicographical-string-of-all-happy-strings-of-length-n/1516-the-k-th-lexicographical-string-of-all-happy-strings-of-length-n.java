class Solution {
    int count = 0;
    String res = "";
    public String getHappyString(int n, int k) {
        backTrack(n,k,new StringBuilder(),' ');
        return res;
    }
    private void backTrack(int n , int k, StringBuilder sb,char lastChar){
        if(!res.isEmpty()){
            return ;
        }
        if(sb.length() == n){
            count++;
            if(count == k){
                res = sb.toString();
            }
            return ;
        }
        for(char c : new char[]{'a','b','c'}){
            if(c!=lastChar){
                sb.append(c);
                backTrack(n,k,sb,c);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }

}