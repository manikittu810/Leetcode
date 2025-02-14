class ProductOfNumbers {
    private List<Integer> prefixProductCache;
    public ProductOfNumbers() {
        prefixProductCache = new ArrayList<>();
        prefixProductCache.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            prefixProductCache = new ArrayList<>();
            prefixProductCache.add(1);
        }else{
            int lastNum = prefixProductCache.get(prefixProductCache.size()-1);
            prefixProductCache.add(lastNum * num);
        }
    }
    
    public int getProduct(int k) {
        int n = prefixProductCache.size();
        if(k>=n){
            return 0;
        }else{
            return prefixProductCache.get(n-1)/prefixProductCache.get(n-1-k);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */