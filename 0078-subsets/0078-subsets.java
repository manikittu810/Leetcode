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
            if(startIndex>=a.length){
            res.add(new ArrayList<>(ans));
            return;
            }
            ans.add(a[startIndex]);
            backTrack(startIndex+1,res,ans,a);
            ans.remove(ans.size()-1);
            backTrack(startIndex+1,res,ans,a);

        }
}