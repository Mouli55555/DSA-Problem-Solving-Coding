class Solution {
    public boolean divideArray(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> mouli = new HashMap<>();
        if(len%2!=0){
            return false;
        }else{
            for(int i=0;i<len;i++){
                mouli.put(nums[i], mouli.getOrDefault(nums[i],0)+1);   //:)
            }
        }
        for (int count : mouli.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}