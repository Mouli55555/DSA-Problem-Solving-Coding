class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        int ptrack = 0;

        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                s.add(nums[i]);
            }else if(nums[i]>pivot){
                b.add(nums[i]);
            }else{
                ptrack++;
            }
        }

        int[] apple = new int[n];
        int xx = 0;
        for(int i=0;i<s.size();i++){
            apple[xx++] = s.get(i);
        }

        for(int i=0;i<ptrack;i++){
            apple[xx++] = pivot;
        }

        for(int i = 0;i<b.size();i++){
            apple[xx++] = b.get(i);
        }
        return apple;        
    }                                      //[[][][][][][][][][][[]]]
}