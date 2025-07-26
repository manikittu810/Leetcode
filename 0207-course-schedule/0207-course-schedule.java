class Solution {
    public boolean canFinish(int V, int[][] a) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<V;i++){
            l.add(new ArrayList<>());
        }
        int[]inDegree = new int[V];

        for(int i=0;i<a.length;i++){
            int v = a[i][1];
            int u = a[i][0];
            l.get(u).add(v);
            inDegree[v]++;
        }
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<V;i++){
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int n = q.poll();
            count++;
            for(int u:l.get(n)){
                inDegree[u]--;
                if(inDegree[u]==0){
                    q.offer(u);
                }
            }
        }
        return (count!=V) ? false : true;
    }
}