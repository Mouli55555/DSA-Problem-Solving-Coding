class Solution {
    ////OM 
    // public static boolean binarySearch(int[] arr, int tar){
    //     int left = 0;
    //     int right = arr.length-1;
    //     while(left<=right){
    //         int mid = (left+right)/2;
    //         if(arr[mid]==tar) return true;
    //         if(arr[mid]>tar){
    //             right = mid-1;
    //         }else{
    //             left = mid+1;
    //         }
    //     }
    //     return false;
    // }
    // public boolean searchMatrix(int[][] matrix, int target) {
    //     int n = matrix.length;
    //     for(int i=0;i<n;i++){
    //         if(binarySearch(matrix[i], target)) return true;
    //     }
    //     return false;
    // }

    //lets try another sol
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = matrix[0].length-1;
        int end = matrix.length-1;

        int i = 0;

        while(i<=end && start>=0){
            if(matrix[i][start]==target) return true;
            if(target<matrix[i][start]){
                start--;
            }else{
                i++;
            }
        }
        return false;
    }
}