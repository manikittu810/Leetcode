class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();

        char[] ch = s.toCharArray();
        for(char i : ch){
            System.out.print(i+" ");
        }
         System.out.println();

        for(int i=0;i<ch.length;i++){
            if(st.isEmpty()){
                System.out.print(ch[i] + " ");
                st.push(ch[i]);
                continue;
            }
            if(!st.isEmpty() && st.peek() == 'A' && ch[i] == 'B' || st.peek() == 'C' && ch[i] == 'D'){
                st.pop();
            }else{
                            st.push(ch[i]);

            }
            System.out.print(ch[i] + " ");
        }        
        return st.size();
    }
}