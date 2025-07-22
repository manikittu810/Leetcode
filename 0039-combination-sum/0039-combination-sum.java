class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        int sum = 0;
        backTrack(a,t,res,l,0);
        return res;
    }
    private void backTrack(int[]a,int t,List<List<Integer>> res,List<Integer> l, int i){
        if(t==0){
            res.add(new ArrayList<>(l));
            return ;
        }
        if(t<0 || i>=a.length){
            return ;
        }
            l.add(a[i]);
            backTrack(a,t-a[i],res,l,i);
            l.remove(l.size()-1);
            backTrack(a,t,res,l,i+1);
        
    }
}