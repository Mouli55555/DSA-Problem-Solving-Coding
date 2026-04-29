class Solution {
    public List<List<Integer>> threeSum(int[] nums) { //:)
        Set<List<Integer>> ansSet  = new HashSet<>();

        for(int i=0;i<nums.length-2;i++){
            int first = nums[i];
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1;j<nums.length;j++){
                int second = nums[j];
                int target = -(first+second);
                
                if(set.contains(target)){
                    List<Integer> trip = Arrays.asList(first, second, target);
                    Collections.sort(trip);
                    ansSet.add(trip);
                    // ansSet.add(trip);
                }
                set.add(second);
            }
        }
        return new ArrayList<>(ansSet);
    }
}