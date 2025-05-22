class Solution {
    public int longestConsecutive(int[] a) {
        if(a.length == 0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for(int i : a){
            set.add(i);
        }

        int max = 0;

        for(int i : set){

            if(!set.contains(i-1)){

                int curElement = i;;
                int curMax = 1;
                while(set.contains(curElement+1)){
                    curElement++;
                    curMax++;
                }
                max = Math.max(max,curMax);
            }
        }
        return max;
    }
}