class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot  = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1){
            int left = 0;
            int right = n-1;
            while(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }
        }else{
            for(int i=n-1;i>=pivot;i--){
                if(nums[i]>nums[pivot]){
                    int temp = nums[i];
                    nums[i] = nums[pivot];
                    nums[pivot] = temp;
                    break;
                }
            }
            int l = pivot+1;
            int r = n- 1;
            while(l<r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }
        }
    }
}