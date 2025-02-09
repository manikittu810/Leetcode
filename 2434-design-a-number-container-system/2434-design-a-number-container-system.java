class NumberContainers {
    Map<Integer,Integer> indexMap;
    Map<Integer,TreeSet<Integer>> valueMap;


    public NumberContainers() {
        indexMap = new HashMap<>();
        valueMap = new HashMap<>();
    }
    
    public void change(int idx, int val) {
        if(indexMap.containsKey(idx)){
            int oldVal = indexMap.get(idx);
            if(valueMap.containsKey(oldVal)){
                valueMap.get(oldVal).remove(idx);
                if(valueMap.get(oldVal).isEmpty()){
                    valueMap.remove(oldVal);
                }
            }
        }
        indexMap.put(idx,val);
        valueMap.putIfAbsent(val,new TreeSet<>());
        valueMap.get(val).add(idx);
    }
    
    public int find(int number) {
        if(!valueMap.containsKey(number) || valueMap.get(number).isEmpty()){
            return -1;
        }
        return valueMap.get(number).first();
        
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */