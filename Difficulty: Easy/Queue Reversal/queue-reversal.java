class Solution {
    public void reverseQueue(Queue<Integer> q) { //:)
        // code here
        int n = q.size();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = q.poll();
        }
        for(int i=arr.length-1;i>=0;i--){
            q.add(arr[i]);
        }
    }
}