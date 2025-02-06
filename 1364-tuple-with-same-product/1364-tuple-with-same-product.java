class Solution {
    public int tupleSameProduct(int[] a) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                int product = a[i]*a[j];
                if(map.containsKey(product)){
                    count+=8*map.get(product);
                }
                map.put(product,map.getOrDefault(product,0)+1);
            }
        }
        return count;
    }
}