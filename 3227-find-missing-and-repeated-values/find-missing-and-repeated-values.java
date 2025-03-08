class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
                if(set.contains(grid[i][j])){      //mouli:)
                    res[0] = grid[i][j];
                    sum-=res[0];
                }
                set.add(grid[i][j]);
            }
        }
        int m = n*n;
        int actualSum = (m*(m+1))/2;
        res[1] = actualSum - sum;
        return res;
    }
}