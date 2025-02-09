class NumberContainers {

    Map<Integer,Integer> indexMap ;
    Map<Integer,TreeSet<Integer>> valueMap;

    public NumberContainers() {
        indexMap = new HashMap<>();
        valueMap = new HashMap<>();
    }
    
    public void change(int index, int value) {

        if(indexMap.containsKey(index)){
            int oldValue = indexMap.get(index);
            if(valueMap.containsKey(oldValue)){ 
                valueMap.get(oldValue).remove(index);
                if(valueMap.get(oldValue).size()==0){
                    valueMap.remove(oldValue);
                }
            }
        }
        indexMap.put(index,value);
        valueMap.putIfAbsent(value,new TreeSet<>());
        valueMap.get(value).add(index);
    }
    
    public int find(int value) {
        if(!valueMap.containsKey(value)||valueMap.get(value).isEmpty()){
            return -1;
        }
        return valueMap.get(value).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */