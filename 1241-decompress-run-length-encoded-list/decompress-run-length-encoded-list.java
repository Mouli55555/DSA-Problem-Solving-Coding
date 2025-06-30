class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();   //:)
        int n = nums.length;
        for(int i=0;i<n;i+=2){
            for(int j=0;j<nums[i];j++){
                li.add(nums[i+1]);
            }
        }
        int[] n1 = new int[li.size()];
        for(int i=0;i<li.size();i++){
            n1[i] = li.get(i);
        }
        return n1;
    } 
}