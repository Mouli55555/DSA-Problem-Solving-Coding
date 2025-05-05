class Solution {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer("");
        int n1 = a.length()-1;
        int n2 = b.length()-1;
        int carry = 0;
        while(n1>=0 || n2>=0 || carry==1){
            int dig1 = 0;
            int dig2 = 0;
            int sum = 0;
            if(n1>=0) dig1 = a.charAt(n1)-'0';
            if(n2>=0) dig2 = b.charAt(n2)-'0';
            sum = dig1^dig2;
            sum ^= carry;
            carry = (dig1&dig2)|(dig1&carry)|(dig2&carry);  //:)
            String val = Integer.toString(sum);
            sb.append(val); 
            n1--;n2--;
        }
        return sb.reverse().toString();
    }
}