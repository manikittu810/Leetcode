class Solution {
    public int totalFruit(int[] a) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxCount  = 0,r=0, l=0,count=0;
        for(r=0;r<a.length;r++){
            map.put(a[r],map.getOrDefault(a[r],count)+1);
           while(map.size()>2){
            int c = map.get(a[l]);
            if(c==1){
                map.remove(a[l]);
            }
            else{
            map.put(a[l],c-1);
            }
            l++;
           }
           maxCount = Math.max(maxCount,r-l+1);
        }
    return maxCount;
    }
}