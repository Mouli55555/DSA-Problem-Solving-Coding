class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {  //:)
        int[] ans = new int[friends.length];  
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int friend : friends) {
            set.add(friend);
        }
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                ans[j] = order[i];j++;
            }
        }
        return ans;
    }
}