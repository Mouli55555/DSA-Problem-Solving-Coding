class Solution {
    public int maxSum(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();  //:)
        int ans = 0;

        if (max >= 0) {
            ans = Arrays.stream(nums)
                        .filter(n -> n > 0)
                        .distinct()
                        .sum(); 
        } else {
            ans = max;
        }

        return ans;
    }
}
