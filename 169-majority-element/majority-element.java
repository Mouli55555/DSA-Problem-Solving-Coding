class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int mouli = 0;
        int tinku = nums[0];
        for(int i=0;i<n;i++){   //:) new one
            if(mouli==0){
                mouli = 1;
                tinku = nums[i];
            }else if(nums[i]==tinku){
                mouli++;
            }else{
                mouli--;
            }
        }
        return tinku;
    }
}