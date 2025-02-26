class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxy = Integer.MIN_VALUE;
        int miny = Integer.MAX_VALUE;
        int curMin = 0;
        int curMax = 0;
        for(int i=0;i<n;i++){
            curMax += nums[i];
            if(curMax<=0) curMax = 0;
            maxy = Math.max(maxy,curMax);         //Shivayaa........

            curMin += nums[i];
            if(curMin>0) curMin = 0;
            miny = Math.min(miny,curMin);
        }
        return Math.max(Math.abs(miny),Math.abs(maxy));
    }
}