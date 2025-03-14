class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> mouli = new ArrayList<>();
        int n = num.length-1;
        int carry = 0;
        while(k>0 || n>=0){
            int sum;
            int rem = k%10;
            if(n>=0){
                sum = rem+num[n]+carry;      //:)
            }else{
                sum = rem+carry;
            }
            carry = sum/10;
            mouli.add(0, sum%10);
            k = k/10;
            n--;
        }
        if(carry>0){
            mouli.add(0, 1);
        }
        return mouli;
    }
}