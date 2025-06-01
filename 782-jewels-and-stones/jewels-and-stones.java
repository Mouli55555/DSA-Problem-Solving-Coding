class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap();
        int ct = 0;
        for(int i=0;i<jewels.length();i++){            //:)
            map.put(jewels.charAt(i),i);
        }
        for(int i=0;i<stones.length();i++){
            if(map.containsKey(stones.charAt(i))){
                ct++;
            }
        }
        return ct;
    }
}