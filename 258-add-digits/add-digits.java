class Solution {
    public int addDigits(int num) {
        while(true){
            int sum = 0;
            if(num>=0 && num<=9){    //:)
                return num;
            }else{
                sum = 0;
                while(num>0){
                int rem = num%10;
                sum+=rem;
                num/=10;
                }
            }
            num = sum;
        }
    }
}