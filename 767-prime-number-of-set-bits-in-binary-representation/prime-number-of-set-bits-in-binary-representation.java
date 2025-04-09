class Solution {
    private int setBits(int n){  //1 bit enni:heheh
        int count = 0;
        while(n>0){
            if((n&1)==1) count++;
            n = n>>1;
        }
        return count;
    }
    private void notPrimesCompute(boolean[] arr){ //sieve of era#%@$##
        arr[0] = true;
        arr[1] = true;
        int n = arr.length-1;
        for(int i=2;i*i<=n;i++){
            if(!arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j] = true;
                }
            }
        }
    }
    public int countPrimeSetBits(int left, int right) {
        boolean[] notPrimes = new boolean[33];
        int primes = 0;
        notPrimesCompute(notPrimes);
        for(int i = left;i<=right;i++){
            int num = setBits(i);
            if(!notPrimes[num]) primes++;
        }
        return primes;
    }
}