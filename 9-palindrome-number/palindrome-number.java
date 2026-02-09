class Solution {
    public int reverse(int n){  //:)
        int val = 0;
        while(n!=0){
            int dig = n%10;
            val = (10*val)+dig;
            n /= 10; 
        }
        return val;
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int val = reverse(x);
        return val==x?true:false; 
    }
}