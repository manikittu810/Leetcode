class Solution {
    public List<List<String>> groupAnagrams(String[] a) {
    
        Map<String,List<String>> map = new HashMap<>();

        for(int i=0;i<a.length;i++){

            char [] ch = a[i].toCharArray();
            
            Arrays.sort(ch);
             
            String str = new String(ch);

            if(!map.containsKey(str)){ 
                map.put(str,new ArrayList<>());
                map.get(str).add(a[i]);
            }else{
                map.get(str).add(a[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}