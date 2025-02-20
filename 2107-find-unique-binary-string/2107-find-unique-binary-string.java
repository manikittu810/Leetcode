class Solution {
	String res = "";
    public String findDifferentBinaryString(String[] nums) {
		int n = nums[0].length();
		Set<String> set = new HashSet<>();
		for(String i : nums){
			set.add(i);
		}
		backTrack(n,"",set);
		return res;   
    }
	private void backTrack(int n, String cur, Set<String> set){
		if(n == cur.length()){
			if(!set.contains(cur)){	
				res = cur;
				set.add(cur);
			}
			return ;
		}
		backTrack(n,cur+'0',set);
		backTrack(n,cur+'1',set);
		
	}
}
