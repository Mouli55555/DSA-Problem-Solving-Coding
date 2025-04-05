class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int mouli = 0;
        for(int i=0;i<hours.length;i++){   //:)
            if(hours[i]>=target){
                mouli++;
            }
        }
        return mouli;
    }
}