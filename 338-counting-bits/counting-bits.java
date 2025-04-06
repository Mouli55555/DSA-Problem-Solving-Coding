class Solution {
    public int ones(int n){
        int mouli = 0;
        while(n>0){
            if((n&1)==1) mouli++;
            n = n>>1;
        }
        return mouli;
    }
    public int[] countBits(int n) {   //:)
        int[] mouli = new int[n+1];
        for(int i=0;i<=n;i++){
            mouli[i] = ones(i);
        }
        return mouli;
    }
}