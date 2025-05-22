class Solution {
    public int longestConsecutive(int[] a) {
        Set<Integer> set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        int max = 0;
        for(int i : a){
            if(!set.contains(i-1)){
                int curElement = i;;
                int curMax = 1;
                while(set.contains(curElement+1)){
                    curElement +=1;
                    curMax++;
                }
                max = Math.max(max,curMax);
            }
        }
        return max;
    }
}