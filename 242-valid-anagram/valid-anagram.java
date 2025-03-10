class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        s.toLowerCase();
        t.toLowerCase();

        char[] mouli = s.toCharArray();
        char[] chandu = t.toCharArray();

        Arrays.sort(mouli);
        Arrays.sort(chandu);

        for(int i=0;i<mouli.length;i++){    //:)
            if(mouli[i]!=chandu[i]){
                return false;
            }
        }
        return true;
    }
}