class Solution {
    public String convertToBase7(int num) {
        //emo sir naku kanapadadhu
        if(num==0) return "0";
        StringBuffer op = new StringBuffer();
        boolean neg = false;
        if(num<0){
            neg = true;
            num*=-1;
        }
        while(num>0){
            int rem = num%7;    //:)
            op.insert(0,rem);
            num/=7;
        }
        if(neg) op.insert(0,"-");
        return op.toString();
    }
}