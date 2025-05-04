class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        Map<String,Integer> map = new HashMap<>();
        int n = dominoes.length;
        for(int i=0;i<n;i++){
            int a = Math.max(dominoes[i][0],dominoes[i][1]);   //:)
            int b = Math.min(dominoes[i][0],dominoes[i][1]);
            dominoes[i][0] = b;
            dominoes[i][1] = a;
            String val = a+""+b;
            count+=map.getOrDefault(val,0);
            map.put(val,map.getOrDefault(val,0)+1);
        }
        return count;
    }
}