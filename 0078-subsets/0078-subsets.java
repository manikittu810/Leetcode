class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backTrack(nums,res,ans,0);
        return res;
    }
    private void backTrack(int[] a,List<List<Integer>> res,List<Integer> ans,int idx){
        res.add(new ArrayList<>(ans));
        for(int i=idx;i<a.length;i++){
            ans.add(a[i]);
            backTrack(a,res,ans,i+1);
            ans.remove(ans.removeLast());
        }
    }
}