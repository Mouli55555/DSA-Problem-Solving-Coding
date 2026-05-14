class Solution {
    public boolean isGood(int[] nums) { //:)
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        if(max==nums.length-1){
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]!=i+1) return false;
            }
            if(nums[nums.length-1]==nums[nums.length-2]){
                return true;
            }else{
                return false;
            }
            
        }else{
            return false;
        }
    }
}