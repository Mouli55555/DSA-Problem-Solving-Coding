class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int tinku[] = new int[n];
        int mouli[] = new int[n];
        tinku[0] = nums[0];
        mouli[n-1] = nums[n-1];
        int l = 1;
        int r = n-2;
        while(l<n && r>=0){                       //:)
            tinku[l] = tinku[l-1]+nums[l];
            mouli[r] = mouli[r+1]+nums[r];
            l++;r--;
        }
        for(int i=0;i<n;i++){
            if(tinku[i]==mouli[i]) return i;
        }
        return -1;
    }
}