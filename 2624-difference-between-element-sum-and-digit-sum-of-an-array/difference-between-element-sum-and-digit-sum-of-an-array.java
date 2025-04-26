class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int eleSum = 0;
        int digSum = 0;
        for(int i=0;i<n;i++){
            int x = nums[i];
            eleSum+=x;
            while(x>0){
                int rem = x%10;
                digSum+=rem;
                x/=10;
            }
        }
        return Math.abs(eleSum-digSum);  //:)
    }
}