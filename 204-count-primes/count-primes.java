class Solution {
    private void mouliCompute(int[] mouli){
        //sieve of er$#@%$% :) lol
        int n = mouli.length-1;
        for(int i=2;i*i<=n;i++){
            if(mouli[i]==0){
                for(int j=i*i;j<=n;j+=i){
                    mouli[j] = 1;
                }
            }
        } 
    }
    public int countPrimes(int n) {
        int[] isPrime = new int[n+1];   //:)
        int count = 0;
        mouliCompute(isPrime);
        for(int i=2;i<n;i++){
            if(isPrime[i]==0) count++;
        }
        return count;
    }
}