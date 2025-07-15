class TimeValuePair{

     String value;

     int timeStamp;

    public TimeValuePair(int timeStamp, String value){

        this.timeStamp = timeStamp;
        this.value = value;

    }
}
class TimeMap {

    Map<String,List<TimeValuePair>> map ;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){

            map.put(key,new ArrayList<TimeValuePair>());
        }
        map.get(key).add(new TimeValuePair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {

        if(!map.containsKey(key)){
            return "";
        }
        return binarySearch(timestamp,map.get(key));
    }

    private String binarySearch(int targetTimeStamp,List<TimeValuePair> list){

        int l = 0, r = list.size()-1;

        String res = "";

        while(l<=r){

            int mid = l+(r-l)/2;
            
            int ts = list.get(mid).timeStamp;

            if(ts == targetTimeStamp){
                res = list.get(mid).value;
                System.out.println(res);
                return res;
            }else if(ts < targetTimeStamp){
                res = list.get(mid).value;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */