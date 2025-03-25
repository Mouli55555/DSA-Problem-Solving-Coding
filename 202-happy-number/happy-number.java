class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> ok = new HashSet<>();
        
        while (n != 1 && !ok.contains(n)) {  //:)
            ok.add(n);
            int tinku = 0;
            while (n > 0) {
                int rem = n % 10;
                tinku += rem * rem;
                n /= 10;
            }
            n = tinku;
        }
        
        return n == 1; 
    }
}
