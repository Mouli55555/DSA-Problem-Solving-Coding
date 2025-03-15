class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n = arr.length;
        int sum = arr[0];
        boolean same = true;
        for(int i=1;i<n;i++){
            sum+=arr[i];
            if(arr[i]!=arr[i-1]) same = false;
        }
        if(sum%3!=0) return false;     //:)
        int mouli = sum/3;
        int lp = 3;
        int chandu = 0;
        for(int i=0;i<n;i++){
            chandu+=arr[i];
            if(chandu==mouli){
                lp--;
                chandu = 0;
            }
        }
        return (lp<=0 || same)? true:false;
    }
}