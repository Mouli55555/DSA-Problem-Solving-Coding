class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
            int tar = i;
            boolean b = true;
            for(int j=0;j<n;j++){
                if(i!=j && s.charAt(tar)==s.charAt(j)){
                    b = false;
                    break;
                }
            }
            if(b) return i;
        }
        return -1;
    }
}