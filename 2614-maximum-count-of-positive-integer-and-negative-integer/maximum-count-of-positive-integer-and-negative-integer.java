class Solution {
    //positive pimding
    public static int mouli(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > 0) {
                if (mid == 0 || nums[mid - 1] <= 0) return mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    //neg pimding
    private int teja(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < 0) {
                if (mid == nums.length - 1 || nums[mid + 1] >= 0) return mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public int maximumCount(int[] nums) {
        int n = nums.length;
        
        //mouli
        int pos = mouli(nums);
        int neg = teja(nums);
        
        int pCount = (pos == -1) ? 0 : (n - pos);
        int nCount = (neg == -1) ? 0 : (neg + 1);
        
        return Math.max(pCount, nCount);
    }
}
