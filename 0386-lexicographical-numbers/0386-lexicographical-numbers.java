class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l= new ArrayList<>();
        for(int i=1;i<=9;i++){
            dfs(i,l,n);
        }
        return l;
    }
    private void dfs(int source,List<Integer> l,int n ){
        if(source>n){
            return ;
        }
        l.add(source);
        for(int j=0;j<=9;j++){
            if(source*10+j>n){
                break;
            }
            dfs(source*10+j,l,n);
        }
    }
}