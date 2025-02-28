class Solution {
    //OM 
    public static boolean binarySearch(int[] arr, int tar){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==tar) return true;
            if(arr[mid]>tar){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            if(binarySearch(matrix[i], target)) return true;
        }
        return false;
    }
}