class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(nums,res,new ArrayList<>(),0);
        return res;
    }
    private void backTrack(int []a,List<List<Integer>> l,List<Integer> list,int n){
        l.add(new ArrayList<>(list));
        for(int i=n;i<a.length;i++){
            list.add(a[i]);
            backTrack(a,l,list,i+1);
            list.remove(list.size()-1);
        }
    }
}