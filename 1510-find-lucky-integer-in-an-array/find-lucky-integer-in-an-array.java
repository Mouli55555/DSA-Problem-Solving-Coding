class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map  = new HashMap<>();   //:)
        int n = arr.length;
        int maxVal  = -1;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if(entry.getKey()==entry.getValue()){
                maxVal = Math.max(maxVal, entry.getKey());
            }
        }
        return maxVal;
    }
}