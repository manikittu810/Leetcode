class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean []visited = new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfsConnected(isConnected,visited,i,isConnected.length);
                count++;
            }
        }
        return count;
    }
    private void dfsConnected(int[][]a,boolean[] visited,int source,int v){
        visited[source] = true;
        for(int i=0;i<a[source].length;i++){
            if(!visited[i] && a[source][i]==1)
            dfsConnected(a,visited,i,v);
        }
    }
}