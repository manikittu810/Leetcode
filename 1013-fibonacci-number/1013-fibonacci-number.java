class Solution {
    private Map<Integer,Integer> cache = new HashMap<>();
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }
       int res = fib(n-1)+fib(n-2);
       cache.put(n,res);
       return res;
    }
}