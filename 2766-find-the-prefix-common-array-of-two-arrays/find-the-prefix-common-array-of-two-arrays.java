class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] freq = new int[51];
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            freq[A[i]]++;freq[B[i]]++;
            int count = 0;
            for(int j=0;j<51;j++){
                if(freq[j]==2) count++;
            } 
            ans[i] = count;//:)
        }
        return ans;
    }
}