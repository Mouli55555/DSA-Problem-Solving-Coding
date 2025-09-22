class Solution {
    public int maxFrequencyElements(int[] nums) {  //:)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int maxFre = 0;
        int maxer = 0;
        for(int i:map.values()){
            if(i>maxer){
                maxer = i;
                maxFre = i;
            }else if(i==maxer){
                maxFre+=i;
            }
        }
        return maxFre;
    }
}