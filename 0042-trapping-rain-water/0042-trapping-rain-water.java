class Solution {
    public int trap(int[] h) {
        int l=0,r=h.length-1;
        int maxL=h[l],maxR=h[r], res=0;
        while(l<r){
            if(maxL<=maxR){
                l++;
                maxL=Math.max(maxL,h[l]);
                res+=maxL-h[l];
            }else{
                r--;
                maxR=Math.max(maxR,h[r]);
                res+=maxR-h[r];
            }
        }
        return res;
    }
}
/*
each width is 1 unit
l=0,
r= n-1
maxleftsofar = 0
max right so far = 0
res=0;
while(l<r){
    if(maxl<=maxr){
        l++;
        maxl= h[l];
        res+=h[l]-maxl;//1-0=1;

    }
    else{
        r--;
        maxr= h[r];
        res+=h[r]-maxr;
    }
    return res

}
 */