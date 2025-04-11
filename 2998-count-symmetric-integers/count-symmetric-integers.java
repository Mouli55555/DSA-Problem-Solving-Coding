class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            String num = Integer.toString(i);
            int n = num.length();
            if((n%2)==0){
                int left = 0;
                int right = n-1;
                int lsum = 0;
                int rsum = 0;
                while(left<right){
                    lsum += num.charAt(left)-'0';
                    rsum += num.charAt(right)-'0';  //:)
                    left++;right--;
                }
                if(lsum==rsum) count++;
            }
        }
        return count;
    }
}