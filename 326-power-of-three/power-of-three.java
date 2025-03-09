class Solution {
    public boolean isPowerOfThree(int teja) {
        if(teja<=0) return false;
        double jasica = Math.log10(teja)/Math.log10(3);   //:mouli
        return jasica == Math.floor(jasica);
    }
}