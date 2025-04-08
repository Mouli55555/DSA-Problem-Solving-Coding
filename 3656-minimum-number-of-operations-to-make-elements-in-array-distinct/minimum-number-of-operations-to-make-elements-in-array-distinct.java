class Solution {
    private int mouli(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length-1;
        for(int i=n;i>=0;i--){
            if(set.contains(arr[i])){
                return i+1;
            }else{
                set.add(arr[i]);
            }
        }
        return 0;
    }
    public int minimumOperations(int[] nums) {  //:)
        int n = nums.length;
        int ind = mouli(nums);
        double val = ind/3.0;
        return (int)Math.ceil(val);
    }
}