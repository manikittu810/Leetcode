class Solution {
    public int findDuplicate(int[] a) {
        int slow = 0;
        int fast = 0;
        do{
            slow = a[slow];
            fast = a[a[fast]];
        }while(slow!=fast);

        slow = 0;
        while(slow!=fast){
            slow = a[slow];
            fast = a[fast];
        }
        return slow;
    }
}