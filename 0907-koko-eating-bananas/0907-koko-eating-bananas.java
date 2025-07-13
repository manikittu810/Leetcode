class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1, right = 0;

        for(int i : piles){
            right = Math.max(right,i);
        }

        while(left<right){
            int mid = left + (right-left)/2;
            if(isPossible(piles,mid,h)){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    private boolean isPossible(int[]piles,int k, int h){
        int time = 0;
        for(int i : piles){
            time+=(i + k - 1)/k;
        }
        return time<=h;
    }
}