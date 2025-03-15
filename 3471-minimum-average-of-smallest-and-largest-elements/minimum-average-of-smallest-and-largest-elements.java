class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        double minAvg = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int l = 0;
        int r = n-1;
        while(l<=r){
            double avg = ((nums[l]+nums[r])/2.0);   //:) 2.0 dec hehe
            minAvg = Math.min(minAvg, avg);
            l++;r--;
        }
        return minAvg;
    }
}