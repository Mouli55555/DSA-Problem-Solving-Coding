class Solution {
    public int minimumPrefixLength(int[] nums) {  //:)
        int ans = 0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                continue;
            }else{
                return i;
            }
        }
        return ans;
    }
}