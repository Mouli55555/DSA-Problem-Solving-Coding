class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();   //:)
        int left = 0, right = 0;
        int maxy = 0;
        while(right<n){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                right++;
            }else{
                while(s.charAt(left)!=c){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(c);
                left++;
            }
            maxy = Math.max(maxy, set.size());
        }
        return maxy;
    }
}