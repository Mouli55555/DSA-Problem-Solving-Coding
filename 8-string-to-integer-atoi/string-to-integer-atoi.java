class Solution {
    public int myAtoi(String s) {
        int res = 0;
        int sign = 1;
        s = s.strip();
        if(s.isEmpty()) return 0;
        int n = s.length();
        int i=0;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign = (s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i))){
            int dig = s.charAt(i) - '0';

            if (res > (Integer.MAX_VALUE - dig) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }


            res = res*10+dig;
            i++;
        }
        return res*sign;
    }
}