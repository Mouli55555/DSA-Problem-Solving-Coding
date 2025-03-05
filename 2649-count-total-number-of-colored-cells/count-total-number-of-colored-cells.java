class Solution {
    public long coloredCells(int n) {
        long ans = 1;
        if(n==1) return ans;
        for(long i=2;i<=n;i++){  //:)
            ans=ans+(4*(i-1));
        }
        return ans;
    }
}