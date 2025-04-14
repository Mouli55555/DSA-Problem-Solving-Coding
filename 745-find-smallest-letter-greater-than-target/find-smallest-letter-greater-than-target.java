class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int  n = letters.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = (right+left)/2;    //:)
            if(letters[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return (left==n)?letters[0]:letters[left];
    }
}