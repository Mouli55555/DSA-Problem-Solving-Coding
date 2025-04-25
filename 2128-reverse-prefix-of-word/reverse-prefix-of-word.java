class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        char[] arr = word.toCharArray();   //:)
        int ind = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==ch){
                ind = i;
                break;
            }
        }
        int left = 0;
        int right = ind;
        while(left<=right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
        return new String(arr);
    }
}