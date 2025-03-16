//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        List<Integer> mouli = new ArrayList<>();
        int n = arr.length;
        int l = 0;
        int r = n-1;
        while(l<r){
            int sum = arr[l]+arr[r];   //mouli
            if(sum==target){ 
                mouli.add(arr[l]);
                mouli.add(arr[r]);
                break;
            }
            if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        return mouli;
    }
}


//{ Driver Code Starts.

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine());

            Solution obj = new Solution();

            List<Integer> ans = obj.twoSum(nums, target);
            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                Collections.sort(ans);
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print(ans.get(i) + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends