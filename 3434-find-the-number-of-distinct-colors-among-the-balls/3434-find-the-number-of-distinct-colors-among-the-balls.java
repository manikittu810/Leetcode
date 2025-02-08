class Solution {
    public int[] queryResults(int limit, int[][] a) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> colorCount = new HashMap<>();

        Set<Integer> set = new HashSet<>();
        int[]res = new int[a.length];

        for(int i=0;i<a.length;i++){
            int x=a[i][0];
            int y =a[i][1];

            if(!map.containsKey(x)){

                map.put(x,y);

            }else {
                int oldBall = map.get(x);
                if(oldBall!=y){
                    colorCount.put(oldBall,colorCount.getOrDefault(oldBall,0)-1);
                    if(colorCount.get(oldBall)==0){
                        set.remove(oldBall);
                    }
                    map.put(x,y);
               }else{
                res[i] = set.size();
                continue;
               }
            }
            colorCount.put(y,colorCount.getOrDefault(y,0)+1);
            set.add(y);
            res[i] = set.size();
        }
            return res;

}
}