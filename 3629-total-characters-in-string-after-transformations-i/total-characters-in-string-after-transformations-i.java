class Solution {
    public int lengthAfterTransformations(String s, int t) {
        final int MOD = 1_000_000_007;

        long[] freq = new long[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        while (t-- > 0) {
            long[] newFreq = new long[26];
            for (int i = 0; i < 26; i++) {
                if (freq[i] == 0) continue;
                if (i == 25) {
                    newFreq[0] = (newFreq[0] + freq[i]) % MOD;
                    newFreq[1] = (newFreq[1] + freq[i]) % MOD;  //:)
                } else {
                    newFreq[i + 1] = (newFreq[i + 1] + freq[i]) % MOD;
                }
            }
            freq = newFreq;
        }
        long total = 0;
        for (long f : freq) {
            total = (total + f) % MOD;
        }
        return (int) total;
    }
}
