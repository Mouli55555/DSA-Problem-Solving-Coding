class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26]; 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        int[] vowelIndices = {0, 4, 8, 14, 20}; //:)
        int maxV = 0;
        int maxC = 0;

        for (int i = 0; i < 26; i++) {
            boolean isVowel = false;
            for (int v : vowelIndices) {
                if (i == v) {
                    isVowel = true;
                    break;
                }
            }
            if (isVowel) {
                maxV = Math.max(maxV, freq[i]);
            } else {
                maxC = Math.max(maxC, freq[i]);
            }
        }
        return maxC+maxV;
    }
}
