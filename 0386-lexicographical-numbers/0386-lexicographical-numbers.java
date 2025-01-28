class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<=9;i++){
            dfs(l,i,n);
        }
        return l;
    }
    private void dfs(List<Integer> l, int source,int n ){

        if(source>n){
            return ;
        }
        l.add(source);
        for(int j=0;j<=9;j++){
            dfs(l,source*10+j,n);
        }
    }
}