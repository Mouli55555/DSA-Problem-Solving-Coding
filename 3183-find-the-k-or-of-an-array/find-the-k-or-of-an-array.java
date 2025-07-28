class Solution {
    public int findKOr(int[] nums, int k) {
        StringBuilder sb = new StringBuilder();  //:)
        for(int i=0;i<32;i++){
            int bitc = 0;
            for(int num:nums){
                int mask = 1<<i;
                if((num&mask)!=0) bitc++;
            }
            if(bitc>=k){
                sb.append(1);
            }else{
                sb.append(0);
            }
        }
        sb.reverse();
        return Integer.parseInt(sb.toString(),2);
    }
}