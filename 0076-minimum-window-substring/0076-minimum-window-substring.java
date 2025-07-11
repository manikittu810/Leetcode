class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length() || s==null || t==null){
            return "";
        }

        Map<Character,Integer> mapT = new HashMap<>();

        for(Character c : t.toCharArray()){
            mapT.put(c, mapT.getOrDefault(c,0)+1);
        }
        //A->1,B-1,C-1
        //required size of the map or string is the size of the hashmap
        int requiredSize = mapT.size();

        int l=0;
        int[]ans={-1,0,0};
        Map<Character,Integer> mapS = new HashMap<>();
        int subStringFormedSize  = 0;

        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            mapS.put(c,mapS.getOrDefault(c,0)+1);

            if(mapT.containsKey(c) &&
            mapT.get(c).intValue() == mapS.get(c).intValue()){
                subStringFormedSize++;
            }

            while(l<=r && subStringFormedSize == requiredSize){
                c=s.charAt(l);
                //saving the smallest window
                if(ans[0]==-1 || r-l+1<ans[0]){
                    ans[0] = r-l+1;
                    ans[1] = l;
                    ans[2] = r;
                }
                mapS.put(c,mapS.get(c)-1);
                if(mapT.containsKey(c) && 
                mapS.get(c).intValue() < mapT.get(c).intValue()){
                    subStringFormedSize--;
                }
                l++;
            }
        }
        return ans[0]==-1 ? "" : s.substring(ans[1],ans[2]+1);
    }
}