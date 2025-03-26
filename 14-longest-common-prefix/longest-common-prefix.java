class Solution {
    public String longestCommonPrefix(String[] strs) {
        int mouli = strs.length;
        StringBuilder tinku = new StringBuilder("");
        int k = 0;
        while(true){
            if(k>=strs[0].length()) break;
            char c = strs[0].charAt(k);
            for(int i=0;i<mouli;i++){
                if( k >= strs[i].length() || c!=strs[i].charAt(k) ) return tinku.toString(); //:)
            }
            tinku.append(c);
            k++;
        }
        return tinku.toString();
    }
}