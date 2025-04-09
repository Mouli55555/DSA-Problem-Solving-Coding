//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.countBits(n);

            IntArray.print(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    private static int setBits(int n){
        int c = 0;
        while(n>0){
            if((n&1)==1) c++;
            n = n>>1;
        }
        return c;
    }
    public static ArrayList<Integer> countBits(int n) {
        // code here
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<=n;i++){
            int c = setBits(i);
            li.add(c);
        }
        return li;
    }
}
