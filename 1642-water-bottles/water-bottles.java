class Solution {
    public int numWaterBottles(int numBottles, int numExchange) { //:)
        int totalBottles = numBottles; 
        while(numBottles>=numExchange){
           int full = numBottles/numExchange;
           totalBottles+= full;
           numBottles= (numBottles%numExchange)+full;
        }
        return totalBottles;
    }
} 