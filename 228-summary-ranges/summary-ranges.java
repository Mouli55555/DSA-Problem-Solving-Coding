class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> mouli = new ArrayList<>();
        if (nums.length == 0) return mouli; 

        int start = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) { //:)
                if (start == i) {
                    mouli.add(String.valueOf(nums[start]));
                } else {
                    mouli.add(nums[start] + "->" + nums[i]);
                }
                start = i + 1; 
            }
        }
        return mouli;
    }
}
