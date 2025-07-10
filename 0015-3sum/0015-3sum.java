class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(i>0 && a[i] == a[i-1]){continue;}
            sum(a,i,res);
        }
        return res;
    }
    private void sum(int[]a,int i , List<List<Integer>> res){
        int j = i+1, k = a.length-1;

        while(j<k){
            int sum = a[i]+a[j]+a[k];
            if(sum == 0){
                res.add(Arrays.asList(a[i],a[j],a[k]));//[[1,2,3]]
                j++;
                k--;
                while(j<k && a[j]==a[j-1]){j++;}
                while(j<k && a[k]==a[k+1]){k--;}
                
            }else if(sum<0){
                j++;
            }else{
                k--;
            }
        }
    }
}
/*
[-1,0,1,2,-1,-4]
[-4,-1,-1,0,1,2]
i.      j     k
i-remains contant 
j k
j++
k--
 */