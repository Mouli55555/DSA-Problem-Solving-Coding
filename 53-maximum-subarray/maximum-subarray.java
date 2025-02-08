class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int maxx = Integer.MIN_VALUE;
        int curSum = 0;
        for(int i=0;i<nums.length;i++){
            curSum+=nums[i];
            if(curSum<0) curSum = 0;
            maxSum = Math.max(curSum,maxSum);
            maxx = Math.max(maxx,nums[i]);
        }
         if(maxSum!=0 && nums.length>0)
        {
            return maxSum;
        } else{
            return maxx;
        } 
    }
}