class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> li = new ArrayList<>();   //:)
        int n = nums.length;
        for(int i=0;i<n;i++){
            li.add(index[i],nums[i]);
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = li.get(i);
        }
        return res;
    }
}