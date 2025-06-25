class Solution {
    public boolean rotateString(String s, String goal) {           //:)

        if(s.equals(goal)) return true;
        StringBuffer str = new StringBuffer(s);
        StringBuffer res = new StringBuffer(goal);

        int c = s.length()-1;
        for(int i=0;i<c;i++){
            char temp = str.charAt(c);
            str.deleteCharAt(c);
            str.insert(0,temp);
            if(str.toString().equals(res.toString())) return true;
        }
        return false;
    }
}