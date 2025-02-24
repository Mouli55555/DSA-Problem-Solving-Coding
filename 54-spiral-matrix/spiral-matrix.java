class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length; 
        
        //dandam raa dootha

        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;

        while(left<=right && top<=bottom){
            for(int j=left;j<=right;j++){
                li.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                li.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    li.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }
        return li;                 
    }
}