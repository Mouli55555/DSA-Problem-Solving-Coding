class Solution {
    public int findPermutationDifference(String s, String t) { //:)
        int val = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            val += Math.abs(i-(t.indexOf(c)));
        }
        return val;
    }
}