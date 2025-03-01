class Solution{
 public List<List<Integer>> threeSum(int[] a){
  List<List<Integer>> list = new ArrayList<>();
  Arrays.sort(a);
  for(int i=0;i<a.length-2;i++){
   if(i>0 && a[i] == a[i-1]) continue;
   twoSum(a,a[i],i+1,list);
  }
  return list;
 }
 private void twoSum(int[]a,int curVal,int curIdx,List<List<Integer>> list){
  int l=curIdx,r=a.length-1;
  while(l<r){
   int sum = curVal + a[l] + a[r];
   if(sum==0){
    list.add(Arrays.asList(curVal,a[l],a[r]));
    while(l<r && a[l]==a[l+1]) l++;
    while(l<r && a[r]==a[r-1]) r--;
    l++; r--;
   }else if(sum<0){l++;}else{r--;}
  }
 }
}
