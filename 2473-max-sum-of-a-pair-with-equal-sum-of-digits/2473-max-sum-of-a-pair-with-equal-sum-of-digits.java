class Solution {
    public int maximumSum(int[] a) {
        Map<Integer,int[]> map = new HashMap<>();
        int maxVal = Integer.MIN_VALUE;
        for(int i: a){

        int key = calculateSum(i);

        if(!map.containsKey(key)){

            map.put(key,new int[]{i,-1});

        }else{

            int[]topTwoNums = map.get(key);//18

            int firstNum = topTwoNums[0];
            int secondNum = topTwoNums[1];

            if(firstNum<i){

                secondNum = firstNum;
                firstNum = i;

            }else if(secondNum <i){

                secondNum = i;
            }
            map.put(key,new int[]{firstNum,secondNum});

            if(secondNum!=-1){
                maxVal = Math.max(maxVal,firstNum+secondNum);
            }
        }
        }
        return (maxVal == Integer.MIN_VALUE) ? -1:maxVal;

    }

    private int calculateSum(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

}