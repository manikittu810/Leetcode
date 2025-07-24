class Solution {
    public static final String[] KEYPAD={
        "",//0th index
        "",//1st index
        "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits==null || digits.length()==0){
            return res;
        }
        StringBuilder sb = new StringBuilder();
        backTrack(res,digits,0,sb);
        return res;
    }
    private static void backTrack(List<String> res, String digits, int startIndex,StringBuilder sb){
        if(startIndex == digits.length()){
            res.add(sb.toString());
            return;
        }
        String letters = KEYPAD[digits.charAt(startIndex)-'0'];
        for(char c : letters.toCharArray()){
            sb.append(c);
            backTrack(res,digits,startIndex+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}