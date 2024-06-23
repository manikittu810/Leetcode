class Solution {
    public int characterReplacement(String s, int k) {
       
       int count[] = new int[26];
       int l=0,r=0;
       int maxLen =0,max_occur_element_frequency=0;
       //1.iterating through given string
       for(r=0;r<s.length();r++){
        char c = s.charAt(r);
        count[c-'A']++; //Increasing frequency of a current element in the window l->r;
        max_occur_element_frequency = Math.max(max_occur_element_frequency,count[c-'A']);

    int w_size = r-l+1;
    int number_of_replacements_needed = w_size - max_occur_element_frequency;

// if some alphabet is exceeding k times in a current window , then strink the window, else update maxLen 
        if(number_of_replacements_needed>k){
            count[s.charAt(l)-'A']--;
            l++;
        }
        else{
            maxLen = Math.max(maxLen,w_size);
        }
       }
        return maxLen;
    }
}