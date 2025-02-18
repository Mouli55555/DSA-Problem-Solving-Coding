class Solution {
    public int findMin(int[] nums) {
        //hero honda splender water bolthey thunder
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid]>=nums[left]  && nums[left]>nums[right]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}