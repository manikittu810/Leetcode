class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int firstOccurenceStartIndex = s.indexOf(part);//2
            s = s.substring(0,firstOccurenceStartIndex) + s.substring(firstOccurenceStartIndex+part.length());
        }
        return s;
    }
}