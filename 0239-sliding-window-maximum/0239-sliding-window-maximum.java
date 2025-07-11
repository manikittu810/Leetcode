class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[]res = new int[n-k+1];
        int idx =0;
        Deque<Integer> deque = new ArrayDeque<>();
        for(int r=0;r<n;r++){
            if(!deque.isEmpty() && deque.peekFirst() <= r-k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && a[deque.peekLast()]<a[r]){
                deque.pollLast();
            }
            deque.offerLast(r);
            if(r>=k-1){
                res[idx++] = a[deque.peekFirst()];
            }
        }
        return res;
    }
}