class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        backTrack(a,t,0,res,l);
        return res;
    }
    private void backTrack(int[]a,int t, int i, List<List<Integer>> res, List<Integer> l){
        if(t==0){res.add(new ArrayList<>(l));return;}
        if(t<0 || i>=a.length){return;}
        l.add(a[i]);
        backTrack(a,t-a[i],i,res,l);
        l.removeLast();
        backTrack(a,t,i+1,res,l);
    }
}