class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][]pair = new int[n][2];

        for(int i=0;i<position.length;i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b)->b[0]-a[0]);//descending order or incrememnting order
        double []time = new double[n];
        for(int i=0;i<n;i++){
            time[i] = (double)(target-pair[i][0])/pair[i][1];
        }
        Stack<Double> st = new Stack<>();
        for(int i=0;i<time.length;i++){
            if(st.isEmpty() || st.peek() < time[i]){
            st.push(time[i]);
            }
        }
        return st.size();
    }
}