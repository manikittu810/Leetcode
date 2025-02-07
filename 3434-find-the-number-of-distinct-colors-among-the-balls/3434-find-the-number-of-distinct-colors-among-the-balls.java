class Solution {
    public int[] queryResults(int limit, int[][] a) {
        
        int []res = new int[a.length];
        int distinct =0;

        Map<Integer,Integer> ball = new HashMap<>(),color = new HashMap<>();
        for(int i = 0;i<a.length;i++){

            int currentBall = a[i][0];
            int currentColor = a[i][1];

            if(ball.containsKey(currentBall)){

                int count = color.get(ball.get(currentBall))-1;
                if(count == 0){
                    color.remove(ball.get(currentBall));
                    distinct--;
                }else{
                    color.put(ball.get(currentBall),count);
                }
            }
                ball.put(currentBall,currentColor);
                int count = color.getOrDefault(currentColor,0)+1;
                color.put(currentColor,count);
                if(count == 1){
                     distinct++;
                }
                res[i] = distinct;
            }
        return res;
    }
}
//