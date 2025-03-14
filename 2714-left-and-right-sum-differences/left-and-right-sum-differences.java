class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] lmouli  = new int[n];
        int[] rmouli = new int[n];
        int l = 1;
        int r = n-2;
        while(l<n && r>=0){
            lmouli[l] = lmouli[l-1]+nums[l-1];     //:)
            rmouli[r] = rmouli[r+1]+nums[r+1];
            l++;r--;
        }
        for(int i=0;i<n;i++){
            nums[i] = Math.abs(lmouli[i]-rmouli[i]);
        }
        return nums;
    }
}