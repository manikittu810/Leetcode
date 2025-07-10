class Solution {
    public int longestConsecutive(int[] a) {
        if(a.length == 0){
            return 0;
        }
      Set<Integer> s = new HashSet<>();
      for(int i : a){
        s.add(i);
      }
      int max = Integer.MIN_VALUE;
      for(int i : s){
        if(!s.contains(i-1)){
            int curNum=i;
            int curCount=1;
            while(s.contains(curNum+1)){
                curNum++;
                curCount++;
            }
        max = Math.max(curCount,max);

        }

      }
      return max;
        
    }
}