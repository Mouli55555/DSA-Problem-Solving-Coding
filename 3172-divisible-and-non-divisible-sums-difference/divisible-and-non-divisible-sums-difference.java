class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 = 0;
        int totalSum = n*(n+1)/2;  //:)
        for(int i=1;i<=n;i++){
            if((i%m)!=0) sum1+=i;
        }
        int sum2 = totalSum-sum1;
        return sum1-sum2;
    }
}