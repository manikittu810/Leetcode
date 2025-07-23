class Solution {
    public List<List<Integer>> permute(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        boolean[]used = new boolean[a.length];
        backTrack(a,res,l,used);
        return res;
    }
    private void backTrack(int[]a,List<List<Integer>> res, List<Integer> l,boolean[]used){
        if(a.length == l.size()){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<a.length;i++){
            if(!used[i]){
                l.add(a[i]);
                used[i] = true;
                backTrack(a,res,l,used);
                used[i]=false;
                l.remove(l.size()-1);
            }
        }
    }
}