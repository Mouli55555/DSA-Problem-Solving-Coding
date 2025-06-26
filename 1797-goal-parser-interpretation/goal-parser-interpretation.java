class Solution {
    public String interpret(String command) {    //:)
        int n  = command.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<n-1;i++){
            char c1 = command.charAt(i);
            char c2 = command.charAt(i+1);
            if(c1=='G'){
                sb.append('G');
            }else if(c1=='(' && c2==')'){
                sb.append('o');
                i++;
            }else if(c1=='(' && c2=='a'){
                sb.append("al");
                i+=3;
            }
        }
        if(command.charAt(n-1)=='G') sb.append('G');
        return sb.toString();
    }
}