class Solution {
    public long maxTotalValue(int[] nums, int k) { //:)
        long ans = 0;
        long max=  Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        long val = max-min;
        // Arrays.sort(nums);
        // int ans = 0;
        // int val = nums[nums.length-1]-nums[0];
        for(int i=0;i<k;i++){
            ans+=val;
        }
        return ans;
    }
}