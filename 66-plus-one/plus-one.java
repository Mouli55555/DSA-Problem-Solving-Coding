class Solution {
    public int[] plusOne(int[] digits) {  //:)
        int carry  = 1, n = digits.length;
        for(int i = n-1;i>=0;i--){
            int sum = carry+digits[i];
            carry = sum==10?1:0;
            digits[i]  = sum%10;
        }
        if(carry==1){
            int[] arr = new int[n+1];
            arr[0] = 1;
            for(int i=0;i<n;i++) arr[i+1] = digits[i];
            return arr;
        }
        return digits;
    }
}