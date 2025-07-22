class Solution {
    public List<List<Integer>> subsets(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        backTrack(a,res,l,0);
        return res;
    }
    private void backTrack(int[]a, 
    List<List<Integer>> res,
    List<Integer> l, int startIndex){
        if(startIndex>=a.length){
            res.add(new ArrayList<>(l));
            return ;
        }
        l.add(a[startIndex]);
        backTrack(a,res,l,startIndex+1);
        l.remove(l.size()-1);
        backTrack(a,res,l,startIndex+1);
        return ;
    }
}