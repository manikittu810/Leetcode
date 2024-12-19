class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V];
        dfs(adj,visited,0);
        for(boolean u : visited){
            if(!u){return false;}
        }
        return true;
    }
    private void dfs(List<List<Integer>> adj,boolean[] visited,int source){
        visited[source]=true;
        for(int u : adj.get(source)){
            if(!visited[u]){
                dfs(adj,visited,u);
            }
        }
    }
}