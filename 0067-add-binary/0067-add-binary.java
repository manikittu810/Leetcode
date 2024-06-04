class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length()-1;
        int n2 = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry =0;
        while(n1>=0 || n2>=0){

            int x = (n1>=0) ? a.charAt(n1) -'0': 0;
            int y = (n2>=0) ? b.charAt(n2) -'0': 0;

            int sum = carry+ x+y;

            carry = sum/2;

            sb.append(sum%2);

            n1--;
            n2--;

        }
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}