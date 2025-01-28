class Solution {
    public boolean canFinish(int V, int[][] a) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i=0;i<V;i++){
            l.add(new ArrayList<>());
        }
        int[] inDegree = new int[V];
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

            int  u = q.poll();

            count++;

            for(int v : l.get(u)){

                inDegree[v]--;
                
                if(inDegree[v]==0){
                    q.offer(v);
                }

            }
        }
        return (count!=V) ? false : true;
    }
}
/*
Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
*/