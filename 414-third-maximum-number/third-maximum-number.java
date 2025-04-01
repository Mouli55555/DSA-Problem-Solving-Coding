class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int counter = 0;
        if(nums.length == 1) return nums[0];
        for(int i=nums.length-1;i>0;i--){    //:)
            if(nums[i]!=nums[i-1]){
                counter++;
            }
            if(counter==2){
                return nums[i-1];
            }
            if(i==1){
                return nums[nums.length-1];
            }
        }
        return -1;
    }
}