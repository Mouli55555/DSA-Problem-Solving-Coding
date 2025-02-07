//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            int a[] = new int[inputArray.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(inputArray[i]);

            Solution ob = new Solution();
            ob.sort012(a);

            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}


// } Driver Code Ends


class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        int n = arr.length;
        // code here
        int count[] = new int[3];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int index = 0;
        for(int i=0;i<3;i++){
            while(count[i]>0){
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}

//{ Driver Code Starts.
// } Driver Code Ends