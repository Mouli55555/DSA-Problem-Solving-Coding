//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public static int[] colSum(int mat[][]) {
        // Your Code Here
        int row = mat.length;
        int col = mat[0].length;
        int[] res = new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){   //mouli
                res[j] += mat[i][j];
            }
        }
        return res;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }
            Solution sln = new Solution();
            int ans[] = sln.colSum(mat);
            for (int i = 0; i < m; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends