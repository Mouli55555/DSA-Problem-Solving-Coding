class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            if((i-k)>=0 && (i+k)<n){
                if(nums[i-k]<nums[i] && nums[i+k]<nums[i]){
                    sum+=nums[i];
                }
            }else if((i-k)>=0){
                if(nums[i-k]<nums[i]){
                    sum+=nums[i];
                }
            }else if((i+k)<=n-1){
                if(nums[i+k]<nums[i]){
                    sum+=nums[i];
                }
            }else{
                sum+=nums[i];
            }
        }
        return sum;
    }
}