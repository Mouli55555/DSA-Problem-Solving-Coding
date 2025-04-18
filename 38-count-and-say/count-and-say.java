class Solution {
    public String newStr(int i,String s){
        if (i==1) return "1";
        StringBuilder result = new StringBuilder();  //:)
        int count = 1;
        char prev = s.charAt(0);
        for (int j = 1; j < s.length(); j++) {
            char current = s.charAt(j);
            if (current == prev) {
                count++;
            } else {
                result.append(count).append(prev);
                count = 1;
                prev = current;
            }
        }
        result.append(count).append(prev);
        return result.toString();
    }
    public String countAndSay(int n) {
        String s = "";
        for(int i=1;i<=n;i++){
            s = newStr(i,s);
        }
        return s;
    }
}