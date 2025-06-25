class Solution {
    public int findKthPositive(int[] arr, int k) {   //:)
        int len = arr.length;
        int n = arr[len-1];
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = i+1;
        }
        for(int i=0;i<len;i++){
            nums[arr[i]-1] = 0;
        }
        System.out.println(Arrays.toString(nums));
        int val = 0;
        int j = 0;
        while(k>0 && j<nums.length){
            if(nums[j]!=0){
                val = nums[j];
                k--;
            }
            j++;
        }
        if (k > 0) {
            val = n + k;
        }
        return val;
    }
}