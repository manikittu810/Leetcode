class Solution {
    public boolean canFinish(int numCourses, int[][] grid) {
        List<List<Integer>> adjList = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        int[] inDegrees = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());//[[],[]]
        }
        for(int i=0;i<grid.length;i++){
            int u = grid[i][0];
            int v = grid[i][1];
            adjList.get(v).add(u);
            inDegrees[u]++;

        }

        for(int i=0;i<numCourses;i++){
            if(inDegrees[i] == 0){
                q.offer(i);
            }
        }
        int count = 0;

        while(!q.isEmpty()){
            int u = q.poll();
            count++;
                for(int v : adjList.get(u)){
                    inDegrees[v]--;
                    if(inDegrees[v]==0){
                        q.offer(v);
                    }
                }
            }
        if(count!=numCourses){
            return false;
        }
        return true;
    }
}