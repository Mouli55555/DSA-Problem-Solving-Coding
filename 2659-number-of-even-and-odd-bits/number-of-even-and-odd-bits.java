class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int mouli = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                if ((mouli & 1) == 0) even++;   //:):)
                else odd++;
            }
            n>>=1;  
            mouli++;
        }
        return new int[]{even, odd};
    }
}