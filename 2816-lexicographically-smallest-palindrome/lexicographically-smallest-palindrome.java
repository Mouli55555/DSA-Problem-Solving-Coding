class Solution {
    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        StringBuffer sb = new StringBuffer(s);  //:)
        while(left<right){
            char l = sb.charAt(left);
            char r = sb.charAt(right);
            if(l==r){
                left++;right--;
                continue;
            }
            else if(l>r){
                sb.setCharAt(left,r);
            }else{
                sb.setCharAt(right,l);
            }
            left++;right--;
        }
        return sb.toString();
    }
}