class Solution {
    public int minimumRecolors(String blocks, int k) {
        int mcount = Integer.MAX_VALUE;
        int n = blocks.length();
        for(int i=0;i<=n-k;i++){
            int count = 0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='W'){    //mouli:):)
                    count++; 
                }
            }
            mcount = Math.min(count, mcount);
        }
        return mcount;
    }
}