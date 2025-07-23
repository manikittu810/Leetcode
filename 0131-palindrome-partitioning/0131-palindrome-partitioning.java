class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> l = new ArrayList<>();
        backTrack(s,res,l,0);
        return res;
    }
    public static void backTrack(String s,List<List<String>> res,List<String> l, int startIndex){
            if(s.length()<=startIndex){
                res.add(new ArrayList<>(l));
                return ;
            }

            for(int end = startIndex;end<s.length();end++){
                if(isPalindrome(s,startIndex,end)){
                    l.add(s.substring(startIndex,end+1));
                    backTrack(s,res,l,end+1);
                    l.remove(l.size()-1);
                }
            }
    }
    public static boolean isPalindrome(String s , int i, int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}