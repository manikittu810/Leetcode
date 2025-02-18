
class Solution {
    public int[] constructDistancedSequence(int n) {

		int len = 2*n-1;

		int []res = new int[len];

		boolean [] placed = new boolean[n+1];

		backTrack(res,placed,n,0);

		return res;

    }

	private boolean  backTrack(int[] res, boolean[] placed, int n, int idx){

			if(idx == res.length){

					return true;
			}

			if(res[idx]!=0){
				return backTrack(res,placed, n,idx+1);
			}

			for(int curNum = n;curNum>=1;curNum--){

				if(!placed[curNum]){
	
					int secondIdx = (curNum==1) ? idx : idx+curNum;

					if(secondIdx <res.length && res[secondIdx]==0){
						res[idx] = curNum;
						res[secondIdx] = curNum;
						placed[curNum] = true;

						if(backTrack(res,placed,n,idx+1)){
							return true;
						}

						res[idx] = 0;
						res[secondIdx] = 0;
						placed[curNum] = false;
					}
				}
                	
			}

		return false;

	}
}
