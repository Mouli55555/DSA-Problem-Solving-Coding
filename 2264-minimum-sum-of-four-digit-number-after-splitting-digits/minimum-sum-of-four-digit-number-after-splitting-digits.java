class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        for(int i=0;i<4;i++){
            int dig = num%10;
            arr[i] = dig;
            num/=10;
        }
        Arrays.sort(arr);
        int num1 = arr[3]+(arr[0]*10);  //:)
        int num2 = arr[2]+(arr[1]*10);
        return num1+num2;
    }
}