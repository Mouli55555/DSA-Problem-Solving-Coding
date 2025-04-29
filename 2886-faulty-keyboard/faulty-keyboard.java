class Solution {
    public String finalString(String s) {
        StringBuffer sb = new StringBuffer();
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='i'){
                sb.reverse();
            }else{
                sb.append(c);   //:)
            }
        }
        return sb.toString();
    }
}