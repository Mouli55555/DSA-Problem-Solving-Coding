class Solution {
    public static int helper(int n){   //:)
        int sum = 0;
        int prod = 1;
        while(n>0){
            int rem = n%10;
            sum += rem;
            prod *= rem;
            n/=10;
        }
        return sum+prod;
    }
    public boolean checkDivisibility(int n) {
        int val = helper(n);
        return (n%val==0)?true:false;
    }
}