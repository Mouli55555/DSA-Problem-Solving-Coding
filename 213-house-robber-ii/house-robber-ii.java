class Solution {
    public int donga(int x, int n, int[] nums){  //:)
        int len = n-x;
        if(n==1) return nums[x];
        if(n==2 || (x==1 && n==3)) return Math.max(nums[x], nums[x+1]); 
        int[] dp = new int[len];
        dp[0] = nums[x];
        dp[1] = nums[x+1];
        int max = dp[0];
        int j = 2;
        for(int i=x+2;i<n;i++){
            if(dp[j-2]>max) max = dp[j-2];
            dp[j] = nums[i]+max;
            j++;
        }
        System.out.println(Arrays.toString(dp));
        System.out.println(dp[len-1]+" "+dp[len-2]);
        return Math.max(dp[len-1], dp[len-2]);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        int m1 = donga(0,n-1,nums);
        int m2 = donga(1,n,nums);
        return Math.max(m1, m2);
    }
}