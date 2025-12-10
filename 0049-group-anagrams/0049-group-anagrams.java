class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] c = s.toCharArray();
            Arrays.sort(c);
            s = new String(c);
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            }else{
                map.put(s, new ArrayList<>());
                map.get(s).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}