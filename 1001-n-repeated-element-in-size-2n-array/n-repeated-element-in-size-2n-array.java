class Solution {
    public int repeatedNTimes(int[] nums) {  //:)
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) map.put(num, map.getOrDefault(num,0)+1);

        int ans = 0;
        for(int num : map.keySet()){
            if(map.get(num)>=(n/2)){
                return num;
            }
        }
        return 0;
    }
}