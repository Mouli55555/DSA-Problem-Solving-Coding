class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int mouli = needle.length();
        for(int i=0;i<=n-mouli;i++){
            int x = 0;
            for(int j=i;j<i+mouli;j++){
                if(haystack.charAt(j)==needle.charAt(x)){  //:)
                    x++;
                }else{
                    break;
                }
                if(x==mouli) return i;
            }
        }
        return -1;
    }
}