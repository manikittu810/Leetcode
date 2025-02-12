class Solution {
    public int maximumSum(int[] a) {
        Map<Integer,int[]> map = new HashMap<>();
        int maxVal = Integer.MIN_VALUE;
        for(int i : a){
        int sum = claculateDigitSum(i);
        if(!map.containsKey(sum)){
            map.put(sum,new int[]{i,-1});
        }else{
            int[]topTwoNums = map.get(sum);
            if(i > topTwoNums[0]){
                topTwoNums[1] = topTwoNums[0];
                topTwoNums[0]=i;
            }else if(topTwoNums[1] < i){
                topTwoNums[1] = i;
            }
            map.put(i, new int[]{topTwoNums[0],topTwoNums[1]});
            if(topTwoNums[1]!=-1){
                maxVal = Math.max(maxVal,topTwoNums[0]+topTwoNums[1]);
            }
        }
        }        
        return (maxVal==Integer.MIN_VALUE) ? -1 : maxVal;
    }
    private int claculateDigitSum(int n){
        int sum =0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}