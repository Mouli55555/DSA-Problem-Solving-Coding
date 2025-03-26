class Solution {
    public int removeElement(int[] nums, int val) {
        int mouli = 0;
        for(int i=0;i<nums.length;i++){  //:)
            if(nums[i]!=val){
                nums[mouli] = nums[i];
                mouli++;
            }
        }
        return mouli;
    }
}