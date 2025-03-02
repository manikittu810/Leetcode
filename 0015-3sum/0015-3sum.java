class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        for(int i =0;i<a.length-2;i++){
            if(i>0 && a[i]==a[i-1]) continue;
            twoSum(a,i+1,a[i],res);
        }
        return res;
    }
    private List<List<Integer>> twoSum(int[]a,int curIdx,int curNum,List<List<Integer>> res){
        int l=curIdx,r = a.length-1;
        while(l<r){
            int sum = curNum+a[l]+a[r];
            if(sum==0){
                res.add(Arrays.asList(curNum,a[l],a[r]));
                while(l<r && a[l] == a[l+1]) l++;
                while(l<r && a[r] == a[r-1]) r--;
                l++;
                r--;
            }else if(sum<0){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}