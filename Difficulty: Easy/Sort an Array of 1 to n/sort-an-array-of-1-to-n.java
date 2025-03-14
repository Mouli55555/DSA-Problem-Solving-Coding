//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    int[] sortArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];           //M
            }
        }
        for(int i=1;i<=max;i++){
            arr[i-1] = i;
        }
        return arr;
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        while (tc-- > 0) {
            String temp[] = sc.nextLine().split(" ");
            int arr[] = new int[temp.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(temp[i]);
            Solution sol = new Solution();
            int res[] = sol.sortArray(arr);
            StringBuilder ss = new StringBuilder("");
            for (int i : res) ss.append(i + " ");
            System.out.println(ss);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends