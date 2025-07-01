class Solution {
    public int possibleStringCount(String word) {  //:)
        int poss = 1;
        int n = word.length()-1;
        for(int i=0;i<n;i++){
            if(word.charAt(i)==word.charAt(i+1)) poss++;
        }
        return poss;
    }
}