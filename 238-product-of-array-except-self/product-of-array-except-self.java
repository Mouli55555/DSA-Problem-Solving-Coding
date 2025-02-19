class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int start = 1;
        int end = n-2;
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        while((start<=n-1)&&(end>=0)){
            prefix[start] = prefix[start-1]*nums[start];
            suffix[end] = suffix[end+1]*nums[end];
            start++;
            end--;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                nums[i] = suffix[i+1];
            }else if(i==(n-1)){
                nums[i] = prefix[i-1];
            }else{
                nums[i] = prefix[i-1]*suffix[i+1];
            }
        }
        return nums;
    }
}