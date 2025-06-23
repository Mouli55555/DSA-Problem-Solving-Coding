class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] suf = new char[n];
        for(int i=0;i<n;i++){
            suf[indices[i]] = s.charAt(i);
        }
        StringBuffer sb = new StringBuffer();  //:)
        for(int i=0;i<n;i++){
            sb.append(suf[i]);
        }
        return sb.toString();
    }
}