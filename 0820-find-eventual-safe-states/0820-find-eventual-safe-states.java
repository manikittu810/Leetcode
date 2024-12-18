class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        //use topological sort , but reverse the graph and store as an adjList for indegrees
        int V = graph.length;
        int[]inDegree = new int[V];
        List<List<Integer>> adjList = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++){
            for(int u : graph[i]){
                adjList.get(u).add(i);
                inDegree[i]++;
            }
        }

        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                q.offer(i);
            }
        }
boolean[] safe = new boolean[V];
while(!q.isEmpty()){
    int u  = q.poll();
    safe[u] = true;
    for(int i : adjList.get(u)){
        inDegree[i]--;
        if(inDegree[i]==0){
            q.offer(i);
        }
    }
}
List<Integer> res = new ArrayList<>();
for(int i=0;i<V;i++){
    if(safe[i]){
        res.add(i);
    }
}
return res;

    }
}