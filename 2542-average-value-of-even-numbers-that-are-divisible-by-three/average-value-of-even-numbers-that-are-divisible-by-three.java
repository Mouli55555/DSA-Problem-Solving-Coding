class Solution {
    public int averageValue(int[] nums) {
        int sum = 0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%6==0){
                sum+=nums[i];
                count++;
            }
        }
        return (count!=0)?Math.round(sum/count):0;  //:)
    }
}