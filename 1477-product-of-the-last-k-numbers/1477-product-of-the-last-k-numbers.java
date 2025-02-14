class ProductOfNumbers {
    private final List<Integer> list;

    public ProductOfNumbers() {
        list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
        
    }
    
    public int getProduct(int k) {
        int n = list.size();
        int res = 1;
        // if(k<=list.size()){
            for(int i=n-1;i>=n-k;i--){
                // if(list.get(i)==0){
                //     return 0;
                // }else{
                    res*=list.get(i);
                // }
            // }
        }
return res;
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */