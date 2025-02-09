class NumberContainers {
    Map<Integer,Integer> indexMap;
    Map<Integer,TreeSet<Integer>> valueMap;


    public NumberContainers() {
        indexMap = new HashMap<>();
        valueMap = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(indexMap.containsKey(index)){
            int oldValue = indexMap.get(index);
            if(valueMap.containsKey(oldValue)){
                valueMap.get(oldValue).remove(index);
                if(valueMap.get(oldValue).isEmpty()){
                    valueMap.remove(oldValue);
                }
            }
        }

        indexMap.put(index,number);
        valueMap.putIfAbsent(number,new TreeSet<>());
        valueMap.get(number).add(index);
    }
    
    public int find(int number) {
        if(valueMap.containsKey(number)){
            return valueMap.get(number).first();
        }
        return -1;
        
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */