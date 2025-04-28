class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] ss = s.toCharArray();
        int l = 0;
        int r = n - 1;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        
        while (l < r) {
            while (l < r && !vowels.contains(ss[l])) {   //:)
                l++;
            }
            while (l < r && !vowels.contains(ss[r])) {
                r--;
            }
            char temp = ss[l];
            ss[l] = ss[r];
            ss[r] = temp;
            l++;
            r--;
        }
        return new String(ss);
    }
}
