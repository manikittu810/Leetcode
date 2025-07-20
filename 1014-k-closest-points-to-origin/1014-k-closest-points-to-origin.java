class Pair{
        int distance,x,y;
        Pair(int x,int y){
            this.distance= (x*x) + (y*y);
            this.x =x;
            this.y=y;
        }
}
class Solution {   
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>(Comparator.comparingInt(p->p.distance));
        for(int[] p : points){
            minHeap.offer(new Pair(p[0],p[1]));
        }

        int [][]result = new int[k][2];
        int index=0;
      while(index<k && !minHeap.isEmpty()){
          Pair c=minHeap.poll();
          result[index][0] = c.x;
          result[index][1] =c.y;
          index++;
      }
        return result;

    }
    }