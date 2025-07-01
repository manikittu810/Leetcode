class Solution {
    public List<List<String>> groupAnagrams(String[] s) {

        Map<String, List<String>> map = new HashMap<>();

        for(int i=0;i<s.length;i++){

            char[]ch = s[i].toCharArray();//e,a,t

            Arrays.sort(ch);//a,e,t
            String s1 = String.valueOf(ch);//aet
            if(!map.containsKey(s1)){//aet
                map.put(s1, new ArrayList<>());//aet,[]
            }
            map.get(s1).add(s[i]);//[eat]
        }
        return new ArrayList<>(map.values());
    }
}