class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a);   
        for(int i = 0;i<a.length-2;i++){
            if(i>0 && a[i]==a[i-1]) continue;
           twoSum(a[i],a,i+1,a.length-1,list);
            }
        return list;
    }
    private void twoSum(int target,int[]a,int l,int r,List<List<Integer>>list){
        while(l<r){
            int sum = a[l]+a[r]+target;
            if(sum == 0 ){
                list.add(Arrays.asList(target,a[l],a[r]));
                while(l<r && a[l]==a[l+1]){
                    l++;
                }
                while(l<r && a[r]==a[r-1]){
                    r--;
                }
                l++;
                r--;
            }else if(sum <  0){
                l++;
            }else{
                r--;
            }
        }
    }
}