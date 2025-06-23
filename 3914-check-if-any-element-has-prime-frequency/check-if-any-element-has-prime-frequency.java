class Solution {
    public static void sivePrimeCompute(int[] isPrime) {    //:)
        isPrime[0] = 1;
        isPrime[1] = 1;
        for (int i = 2; i*i <= 100; i++) {
            if (isPrime[i] == 0) {
                for (int j = i*i; j <= 100; j += i) {
                    isPrime[j] = 1;
                }
            }
        }
    }

    public boolean checkPrimeFrequency(int[] nums) {
        int[] isPrime = new int[101]; 
        sivePrimeCompute(isPrime);
        
        int[] freq = new int[101];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        for (int i = 0; i < 101; i++) {
            if (freq[i] > 0 && isPrime[freq[i]] == 0) {
                return true; 
            }
        }
        return false;
    }
}
