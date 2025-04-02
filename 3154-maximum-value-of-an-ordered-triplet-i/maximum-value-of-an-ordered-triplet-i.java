class Solution {
    public long maximumTripletValue(int[] nums) {
        long mouli = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                long peeku = nums[i]-nums[j];
                for(int k=j+1;k<n;k++){
                    mouli = Math.max(mouli, (peeku*nums[k]));  //:)
                }
            }
        }
        return (mouli<=0)?0:mouli;
    }
}