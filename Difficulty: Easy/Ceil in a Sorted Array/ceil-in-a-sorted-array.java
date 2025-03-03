//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        int n = arr.length;
        int l = 1;
        int r = n-1;
        if(arr[0]>=x) return 0;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]>=x && arr[mid-1]<x) return mid; //<.M.>
            else if(arr[mid]<x){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }
}



//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int x = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            int ans = ob.findCeil(arr, x);

            System.out.println(ans);

            System.out.println("~"); // New line after printing the results
        }
    }
}

// } Driver Code Ends