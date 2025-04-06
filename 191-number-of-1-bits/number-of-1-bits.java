class Solution {
    public int hammingWeight(int n) {
        int mouli = 0;
        while(n>0){
            if((n&1) == 1)mouli++;  //:)
            n = n>>1;
        }
        return mouli;
    }
}