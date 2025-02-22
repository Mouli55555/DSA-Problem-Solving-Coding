class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int chekker = target - nums[i];
            if(map.containsKey(chekker)){
                return new int[]{map.get(chekker), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}