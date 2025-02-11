class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int firstOccurence = s.indexOf(part);
            s = s.substring(0,firstOccurence) + s.substring(firstOccurence+part.length());
        }
        return s;
    }
}