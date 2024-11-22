class Solution {
    public List<List<Integer>> subsetsWithDup(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        backTrack(0,res,ans,a);
        return res;
    }
    private void backTrack(int curLevelInCurIteration,
        List<List<Integer>> res ,
        List<Integer> ans,int[] a
    ){
        res.add(new ArrayList<>(ans));

        for(int i=curLevelInCurIteration;i<a.length;i++){
            
        if(i>curLevelInCurIteration && a[i]==a[i-1]){
            continue;
        }
        ans.add(a[i]);

        backTrack(i+1,res,ans,a);

        ans.remove(ans.size()-1);

        }
        
    }
}