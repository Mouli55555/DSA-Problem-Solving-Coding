class Solution {
    public int rev(int n){
        int val = 0;
        int i = 0;
        while(n>0){
            int rem = n%10;
            val = (val*10)+rem;
            n/=10;
            i++;
        }
        return val;
    }
    public boolean isSameAfterReversals(int num) {  //:)
        int rev1 = rev(num);
        rev1 = rev(rev1);
        return rev1==num;
    }
}