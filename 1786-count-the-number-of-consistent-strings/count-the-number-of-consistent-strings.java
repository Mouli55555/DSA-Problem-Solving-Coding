class Solution {
    public int countConsistentStrings(String allowed, String[] words) {  //:)
        int count=0;
        boolean[] allow = new boolean[26];
        for(char c:allowed.toCharArray()){
            allow[c-'a'] = true;
        }
        for(String word:words){
            boolean isConsis = true;
            for(char c:word.toCharArray()){
                if(!allow[c-'a']){
                    isConsis = false;
                    break;
                }
            }
            if(isConsis) count++;
        }
        return count;
    }
}