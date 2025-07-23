class Solution {
    public List<List<Integer>> combinationSum2(int[] a, int t) {
        Arrays.sort(a);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        backTrack(a,t,0,res,l);
        return res;
    }
    private void backTrack(int[]a,int t,int idx,List<List<Integer>> res, List<Integer> l){
        if(t==0){
            res.add(new ArrayList<>(l));
            return ;
        }
        for(int i=idx;i<a.length;i++){
            if(i>idx && a[i]==a[i-1]){continue;}
            if(a[i]>t){
                break;
            }
            l.add(a[i]);  
            backTrack(a,t-a[i],i+1,res,l);
            l.remove(l.size()-1);
        }
    }
}