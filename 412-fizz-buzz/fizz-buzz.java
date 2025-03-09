class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> mouli = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if((i%3==0) && (i%5==0)){
                mouli.add("FizzBuzz");
            }else if((i%3==0)){
                mouli.add("Fizz");
            }else if((i%5==0)){
                mouli.add("Buzz");
            }else{
                mouli.add(Integer.toString(i));
            }
        }
        return mouli;
    }
}