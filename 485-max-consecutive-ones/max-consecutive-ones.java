class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mouli = 0;
        int tinku = 0;
        for(int i=0;i<nums.length;i++){             //:)
            if(nums[i]==1){
                mouli++;
                tinku = Math.max(mouli, tinku);
            }else{
                tinku = Math.max(mouli, tinku);
                mouli=0;
            }
        }
        return tinku;
    }
}