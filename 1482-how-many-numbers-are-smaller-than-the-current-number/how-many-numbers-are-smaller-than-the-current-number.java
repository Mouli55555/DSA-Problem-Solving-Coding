class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] mouli = new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){     //:)
                if(i==j) continue;
                else{
                    if(nums[j]<nums[i]){
                        mouli[i]+=1;
                    }
                }
            }
        }
        return mouli;
    }
}