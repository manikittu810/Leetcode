class Solution {
    public int[] findOrder(int V, int[][] grid) {
        List<List<Integer>> adjList = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] inDegree = new int[V];
        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<grid.length;i++){
            int u = grid[i][1];
            int v = grid[i][0];
            adjList.get(u).add(v);
            inDegree[v]++;
        }

        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                q.offer(i);
            }
        }
        int [] res = new int[V];
        int idx = 0;
        while(!q.isEmpty()){
            int u = q.poll();
            res[idx++] = u;
            for(int i : adjList.get(u)){
                inDegree[i]--;
                if(inDegree[i]==0){
                    q.offer(i);
                }
            }
        }

        return (idx == V) ? res : new int[0];
    }
}