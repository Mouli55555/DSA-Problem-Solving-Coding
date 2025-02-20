class Solution {
    public int findKthLargest(int[] nums, int k) {
        //smile
        PriorityQueue<Integer> lineLoUndra = new PriorityQueue<>(Collections.reverseOrder());
        //max-heap eyyatam jarigindhi 
        for(int num:nums){
            lineLoUndra.add(num);
        }
        //konni teseydam jaridinfhi
        for(int i=0;i<k-1;i++){
            lineLoUndra.poll();
        }
        //manaki kavalsindhi edey lemma :)
        return lineLoUndra.peek();

    }
}