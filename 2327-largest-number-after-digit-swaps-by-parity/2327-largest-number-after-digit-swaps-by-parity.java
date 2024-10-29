class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> e = new PriorityQueue<>();
        PriorityQueue<Integer> o = new PriorityQueue<>();

        int n1 = num;
        while(n1>0){
            int s= n1%10;
            if(s%2==0){
                e.offer(s);
            }
            else{
                o.offer(s);
            }
            n1/=10;
        }
    StringBuilder sb = new StringBuilder();

     n1 = num;

     while(n1>0){
        int s = n1%10;
        if(s%2==0){
            sb.append(e.poll());
        }
        else{
            sb.append(o.poll());
        }
        n1/=10;
     }
     sb.reverse();
     return Integer.parseInt(sb.toString());
    }
}