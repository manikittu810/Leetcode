class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s :strs){
            char []c = s.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);
            if(!map.containsKey(s1)){
                map.put(s1,new ArrayList<String>());
            }
            map.get(s1).add(s);
        }
        return new ArrayList(map.values());
    }
}