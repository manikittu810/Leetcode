class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a);// if i sort the array i can have chance to skip the duplicate elements
        for(int i =0;i<a.length-2;i++){
            if(i>0 && a[i]==a[i-1]) continue;
            twoSum(a,a[i],i+1,list);
        }
        return list;
    }
    public List<List<Integer>> twoSum(int[]a,int num, int j,List<List<Integer>> list){
        int k = a.length-1;
        while(j<k){ 
            int sum = num + a[j]+a[k];
            if(sum ==0){
                list.add(Arrays.asList(num,a[j],a[k]));
                while(j<k && a[j] == a[j+1]) j++;
                while(j<k && a[k] == a[k-1]) k--;
                j++;k--;
           }
           else if(sum<0){
            j++;
           }
           else{
            k--;
           }
        }
        return list;
    }
}