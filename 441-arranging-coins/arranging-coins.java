class Solution {
    public int arrangeCoins(int n) {
        int rows = 0;
        int height = 1;
        while(n>0){
            n = n-height;  //:)
            if(n>=0){
                height++;
                rows++;
            }
        }
        return rows;
    }
}