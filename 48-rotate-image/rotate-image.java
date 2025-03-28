class Solution {
    public void tinku(int[][] arr){
        int mouli = arr.length;
        for(int i=0;i<mouli;i++){
            for(int j=i;j<mouli;j++){    //:)
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public void lilly(int[][] arr){
        int mouli = arr.length;
        int l = 0;
        int r = mouli-1;
        while(l<r){
            for(int i=0;i<mouli;i++){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
            }
            l++;r--;
        }
    }
    public void rotate(int[][] matrix) {
        tinku(matrix);
        lilly(matrix);
    }
}