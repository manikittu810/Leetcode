class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
                char[] sortedArr = strs[i].toCharArray();//e,a,t
                Arrays.sort(sortedArr);//a,e,t
                String s = new String(sortedArr);//aet
                if(!map.containsKey(s)){//no
                        map.put(s,new ArrayList<>());//"aet"->{};
                }
                map.get(s).add(strs[i]);                
        }
        return new ArrayList<>(map.values());
    }
}