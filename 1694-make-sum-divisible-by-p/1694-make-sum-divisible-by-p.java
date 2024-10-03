class Solution {
    public int minSubarray(int[] a, int p) {
        int n=a.length,totalSum = 0;
        for(int i : a){
            totalSum=(totalSum+i)%p;
        }
        int target = totalSum%p;

        if(target == 0){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int currentSum = 0;
        int minLen = n;

        for(int i=0;i<n;i++){
            currentSum = (currentSum+a[i])%p;
            int neededNumber = (currentSum - target +p)%p;
            if(map.containsKey(neededNumber)){
                minLen = Math.min(minLen,i-map.get(neededNumber));
            }
    map.put(currentSum,i);
        }

       return minLen ==n ? -1 : minLen;

    }
}