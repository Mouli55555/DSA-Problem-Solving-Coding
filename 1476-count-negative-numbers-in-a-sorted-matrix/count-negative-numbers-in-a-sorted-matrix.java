class Solution {
    private int bSearch(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = (left+right)/2;   //:)
            if(arr[mid]<0){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return (n-left);
    }
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int mouli = 0;
        for(int i=0;i<n;i++){
            mouli += bSearch(grid[i]);
        }
        return mouli;
    }
}