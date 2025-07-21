class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []freqArray = new int[26];
        for(char t : tasks){
            freqArray[t-'A']++;
        }
        Arrays.sort(freqArray);
        int maxFreq = freqArray[25]-1;
        int idleSlots = maxFreq * n;
        for(int i=24;i>=0 && freqArray[i]>0 ; i--){
            idleSlots -= Math.min(maxFreq,freqArray[i]);
        }
        if(idleSlots>0){
            return idleSlots+ tasks.length;
        }
        else{
            return tasks.length;
        }
    }
}