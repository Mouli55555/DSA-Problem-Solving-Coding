class Solution {
    public int minimumCost(int[] cost) {   //:)
        Arrays.sort(cost);
        int answer = 0;
        for(int i=cost.length-1;i>=0;i-=3){
            answer += cost[i];

            if((i-1)>=0){
                answer += cost[i-1];
            }
        }
        return answer;
    }
}