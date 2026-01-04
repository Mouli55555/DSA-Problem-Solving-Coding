class Solution {
    public int sumFourDivisors(int[] nums) {  //:)
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0, tSum = 0;
            for(int j=1;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    tSum += j;
                    count++;;
                    if(!(j*j==nums[i])){
                        tSum += nums[i]/j;
                        count++;
                    }
                }
            }
            // System.out.println(nums[i]+" "+tSum+" "+count);
            if(count==4) ans += tSum;
        }
        return ans;
    }
}