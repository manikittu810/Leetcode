class Solution {
    public int trap(int[] a) {
	int l=0,r=a.length-1,ans = 0;
	int maxLeftNow = a[l],maxRightNow = a[r];
	while(l<r){
		if(maxLeftNow <= maxRightNow){
			l++;
			maxLeftNow = Math.max(maxLeftNow,a[l]);
			int n = maxLeftNow - a[l];
			if(n>0){
				ans+=n;
			}
		}
		else{
			if(maxLeftNow>maxRightNow){
				r--;
				maxRightNow = Math.max(maxRightNow,a[r]);
				int n = maxRightNow - a[r];
				if(n>0){
					ans+=n;
				}
			}
		}
	}
	return ans;
    }
}
