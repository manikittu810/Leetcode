class Solution {
    public List<List<Integer>> subsetsWithDup(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(a);
        backTrack(a,res,l,0);
        return res;
    }
    private void backTrack(int[]a,List<List<Integer>> res, 
    List<Integer> l,int startIndex){
        res.add(new ArrayList<>(l));
        for(int i=startIndex;i<a.length;i++){
            if(i>startIndex && a[i]==a[i-1]){
                continue;
            }
            l.add(a[i]);
            backTrack(a,res,l,i+1);
            l.remove(l.size()-1);
        }
    }
}