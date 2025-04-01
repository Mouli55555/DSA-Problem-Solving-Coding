//{ Driver Code Starts
// Initial Template for Java
import java.util.Scanner;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public boolean checkValidity(int a, int b, int c) {
        // code here
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Solution obj = new Solution();
            if (obj.checkValidity(a, b, c))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends