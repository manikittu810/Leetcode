class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<s.length;i++){
            String str = s[i];
            char[]ch = str.toCharArray();
            Arrays.sort(ch);
            str = String.valueOf(ch);
            System.out.println(str);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());//[aet,[]]
            }
            map.get(str).add(s[i]);
        }
        return new ArrayList<>(map.values());
    }
}
/*
"eat"
char[] ch = s[i].toCharArray();// ['e','a','t']
sort the ch
convert that sorted ch into a string again->key
Map<String, List<String>> map ;
<"aet",[]>
if aet then add the current unmodified string from the string array into the existing sorted strings list in the map
<"aet",[eat]>

 */