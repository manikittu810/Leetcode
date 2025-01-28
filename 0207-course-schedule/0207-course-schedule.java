class Solution {
    public boolean canFinish(int V, int[][] a) {
        List<List<Integer>> l = new ArrayList<>();

        for(int i=0;i<V;i++){
           l.add(new ArrayList<>());
        }
        int[] inDegree= new int[V];

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
        int count = 0;

        while(!q.isEmpty()){
            int u = q.poll();

            for(int v : l.get(u)){

                inDegree[v]--;

                if(inDegree[v]==0){
                    q.offer(v);
                }
            }

            count++;
        }
        return (count!=V) ? false : true;
    }
}
/*
given two vertices 
given [1,0]
0->1
0 is the job and 1 is the dependency
i need to solve 0 before visiting 1
count == V true else false
 */