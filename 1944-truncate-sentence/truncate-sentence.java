class Solution {
    public String truncateSentence(String s, int k) {
        StringBuffer sb = new StringBuffer();
        String[] words = s.split(" ");
        for(int i=0;i<k;i++){
            if(i==0)
            sb.append(words[i]);
            else
            sb.append(" "+words[i]);
        }
        System.out.println(Arrays.toString(words));  //:)
        return sb.toString();
    }
}