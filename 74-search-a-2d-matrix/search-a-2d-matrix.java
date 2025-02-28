class Solution {

    //<><><><><><><><><><><><><><><><><><><><><><><><><><><><>
    public static boolean binarySearch(int[] arr, int tar){
        int n = arr.length;
        int l = 0;
        int r = n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==tar) return true;                      //:)
            if(arr[mid]<tar){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return false;
    }
     //<><><><><><><><><><><><><><><><><><><><><><><><><><><><>
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int l = 0;
        int r = n-1;
        while(l<=r){
            int mid = (l+r)/2;
            int m = matrix[mid].length;
            if(target>=matrix[mid][0] && target<=matrix[mid][m-1]) {
                return binarySearch(matrix[mid], target);
            }
            if(matrix[mid][0]>target){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return false;
    }
}