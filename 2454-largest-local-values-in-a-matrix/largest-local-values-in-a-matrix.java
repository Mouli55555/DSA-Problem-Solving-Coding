class Solution {
    public int[][] largestLocal(int[][] grid) {   //:)
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                int maxVal = Integer.MIN_VALUE;
                for (int x=i-1;x<=i+1;x++) {
                    for (int y=j-1;y<=j+1;y++) {
                        maxVal = Math.max(maxVal, grid[x][y]);
                    }
                }
                ans[i-1][j-1] = maxVal; 
            }
        }
        return ans;
    }
}