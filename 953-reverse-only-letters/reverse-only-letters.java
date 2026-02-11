class Solution {
    public String reverseOnlyLetters(String s) { //:)
        int left = 0, right = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(left<right){
            char l = sb.charAt(left);
            char r = sb.charAt(right);
            if(Character.isLetter(l) && Character.isLetter(r)){
                char temp = l;
                sb.setCharAt(left,r);
                sb.setCharAt(right, l);
                left++;right--;
            }else if(Character.isLetter(l)){
                right--;
            }else{
                left++;
            }
        }
        return sb.toString();
    }
}