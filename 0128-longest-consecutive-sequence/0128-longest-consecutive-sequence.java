class Solution {
    public int longestConsecutive(int[] a) {
        int max = 0;
        Set<Integer> set = new HashSet<>();

        for(int i : a){
            set.add(i);
        }
        for(int i : a){
            int curElement = i;
            int curMax = 0;
            while(set.contains(curElement)){
                curElement -=1;
                curMax++;
            }
            max = Math.max(max,curMax);
        }
        return max;

    }
}