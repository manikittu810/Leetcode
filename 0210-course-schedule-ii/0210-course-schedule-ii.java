class Solution {
    public int[] findOrder(int V, int[][] a) {

        List<List<Integer>> l = new ArrayList<>();

        for(int i=0;i<V;i++){
            l.add(new ArrayList<>());
        }

        int[]inDegree = new int[V];

        for(int i=0;i<a.length;i++){
            int v = a[i][1];
            int u = a[i][0];
            l.get(v).add(u);
            inDegree[u]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                q.offer(i);
            }
        }

        int[]res = new int[V];
        int idx = 0;

        while(!q.isEmpty()){

            int u = q.poll();
            res[idx++] = u;
            for(int v : l.get(u)){
                inDegree[v]--;
                if(inDegree[v]==0){
                    q.offer(v);
                }
            }
        }
        return (idx==V) ? res : new int[0];
    }
}