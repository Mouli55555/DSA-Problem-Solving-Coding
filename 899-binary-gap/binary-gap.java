class Solution {
    public int binaryGap(int n) {  //:)
        int maxGap = 0;
        boolean encounter = false;
        int count = 0;
        while(n>0){
            int bit = (n&1);
            if(bit==1){
                if(encounter) maxGap = Math.max(maxGap, count);
                encounter = true;
                count=1;
            }else if(encounter){
                count++;
            }
            n = n>>1;
        }
        return maxGap;
    }
}