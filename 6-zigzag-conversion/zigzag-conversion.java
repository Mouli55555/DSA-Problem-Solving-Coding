class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        char[][] mat = new char[numRows][n];
        int ptr = 0;
        int i = 0, j = 0;

        while (ptr < n) {
            for (i = 0; i < numRows && ptr < n; i++) {  //:)
                mat[i][j] = s.charAt(ptr++);
            }
            i -= 2; 
            j++;    
            while (i > 0 && ptr < n) {
                mat[i][j] = s.charAt(ptr++);
                i--;
                j++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (i = 0;i<numRows;i++) {
            for (j = 0;j<n;j++) {
                if (mat[i][j]!=0) { 
                    result.append(mat[i][j]);
                }
            }
        }
        return result.toString();
    }
}
