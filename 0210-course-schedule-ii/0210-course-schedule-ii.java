class Solution {
    public int[] findOrder(int V, int[][] a) {

        List<List<Integer>> l = new ArrayList<>();

        for(int i=0;i<V;i++){

            l.add(new ArrayList<>());

        }

        int[]inDegree = new int[V];

        for(int i=0;i<a.length;i++){

            int u = a[i][1];

            int v = a[i][0];

            l.get(u).add(v);

            inDegree[v]++;

        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                q.offer(i);
            }
        }
            int idx = 0;
            int []res = new int[V];
        while(!q.isEmpty()){
            int u= q.poll();
            res[idx++] = u;
            for(int v : l.get(u)){
                inDegree[v]--;
                if(inDegree[v]==0){
                    q.offer(v);
                }
            }
        }
        return res;
    }
}