class Solution {
    public boolean isPalindrome(String s) {
        String kotha = "";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                kotha+=Character.toLowerCase(s.charAt(i));
            }
        }
        String rev = new StringBuffer(kotha).reverse().toString();
        if(kotha.equals(rev)){
            return true;
        }else{
            return false;
        } 
    }
}