class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mouli = new int[n][n];

        int left = 0,right=n-1,top=0,bottom=n-1;   //:)
        int val = 1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                mouli[top][i] = val;
                val++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                mouli[i][right] = val;
                val++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    mouli[bottom][i] = val;
                    val++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    mouli[i][left] = val;
                    val++;
                }
                left++;
            }

        }
        return mouli;
    }
}