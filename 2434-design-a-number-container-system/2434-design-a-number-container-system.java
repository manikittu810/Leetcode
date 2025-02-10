class NumberContainers {

    Map<Integer,Integer> indexMap;
    Map<Integer,TreeSet<Integer>> valueMap;


    public NumberContainers() {
        indexMap = new HashMap<>();
        valueMap = new HashMap<>();
    }
    
    public void change(int x, int y) {
        if(indexMap.containsKey(x)){
            int oldValue = indexMap.get(x);
            if(valueMap.containsKey(oldValue)){
                valueMap.get(oldValue).remove(x);
                if(valueMap.get(oldValue).isEmpty()){
                    valueMap.remove(oldValue);
                }
            }
        }
        indexMap.put(x,y);
        valueMap.putIfAbsent(y,new TreeSet<>());
        valueMap.get(y).add(x);
    }
    
    public int find(int number) {
        if(valueMap.containsKey(number)){
            return valueMap.get(number).first();
        }else{
        return -1;

        }
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */