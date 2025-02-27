//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class gfg {

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String inputLine[] = read.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int target = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            System.out.println(obj.pairInSortedRotated(arr, target));
        }
    }
}
// } Driver Code Ends



class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        int n = arr.length;
        int pivot = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i;
                break;
            }
        }
        int max = (pivot == -1) ? n - 1 : pivot; // pedda
        int min = (pivot == -1) ? 0 : (pivot + 1) % n; 

    
        while (min != max) {
            int sum = arr[min] + arr[max];

            if (sum == target) return true;
            else if (sum < target) min = (min + 1) % n; 
            else max = (max - 1 + n) % n; // 
        }

        return false;
    }
}
