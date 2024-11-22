class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backTrack(0,result,ans,nums);
        return result;
        }

        private void backTrack(
            int startIndex,List<List<Integer>> res,List<Integer> ans,int[] a
        ){
        res.add(new ArrayList<>(ans));
        for(int i=startIndex;i<a.length;i++){
            ans.add(a[i]);
            backTrack(i+1,res,ans,a);
            ans.remove(ans.size()-1);
        }
        }
}