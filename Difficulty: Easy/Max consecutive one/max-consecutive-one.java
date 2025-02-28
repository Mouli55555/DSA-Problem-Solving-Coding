//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.maxConsecutiveCount(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int maxConsecutiveCount(int[] arr) {
        // code here
        int n = arr.length;
        
        int curzeros = 0;
        int maxzeros = 0;
        
        int curones = 0;
        int maxones = 0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                curzeros++;
                curones = 0;
                
            }else{
                curzeros = 0;
                curones++;
            }
            maxzeros = Math.max(curzeros, maxzeros);
            maxones = Math.max(curones, maxones);
        }
        return Math.max(maxones, maxzeros);
    }
}
