class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i=0;i<nums.length;i++){
            treeSet.add(nums[i]);
        }

        int a[]=new int[treeSet.size()];
        int idx = 0;
        for(int i : treeSet){
            a[idx++] = i;
        }
        int count = 1,ans=1;
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]+1){
                count++;
                if(ans<count){
                    ans = count;
                }
            }
                else{
                count=1;
                }
        }
return ans;
    }
}