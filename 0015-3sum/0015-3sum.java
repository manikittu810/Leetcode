class Solution {
    public List<List<Integer>> threeSum(int[] a) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(a);//nlogn
            for(int i=0;i<a.length;i++){
                if(i>0 && a[i]==a[i-1]){continue;}
                addSum(a,i,res);//nlogn+n
            }
            return res;
    }
    private void addSum(int[]a,int i,List<List<Integer>> l){
        int j=i+1, k = a.length-1;
        while(j<k){
            
            int sum = a[i]+a[j]+a[k];
            if(sum==0){
                l.add(Arrays.asList(a[i],a[j],a[k]));
                j++;
                k--;
            while(j<k && a[j] == a[j-1]){j++;}
            while(j<k && a[k] == a[k+1]){k--;}
            }else if(sum<0){
                j++;
            }else if(sum>0){
                k--;
            }
           
        }
    }
}