class Solution {
    public long maxAlternatingSum(int[] nums) { //:)
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long ans = 0;
        int l= 0;
        int r= nums.length-1;
        while(l<r){
            ans+=nums[r];
            ans-=nums[l];
            l++;r--;
        }
        if (l == r) {
            ans += nums[l];
        }
        return ans;
    }
}