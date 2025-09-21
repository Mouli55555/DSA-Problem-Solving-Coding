class Solution {
    public int evenNumberBitwiseORs(int[] nums) {  //:)
        int val = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if((nums[i]&1)==0){
                val |= nums[i];
            }
        }
        return val;
    }
}