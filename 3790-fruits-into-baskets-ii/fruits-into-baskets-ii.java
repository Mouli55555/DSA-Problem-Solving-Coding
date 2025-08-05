class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int mottam = fruits.length;
        int mouli = 0;
        for(int i=0;i<mottam;i++){
            for(int j = 0;j<mottam;j++){
                if(fruits[i]<=baskets[j]){   //mouli:)
                    baskets[j] = -1;
                    mouli++;
                    break;
                }
            }
        }
        return mottam-mouli;
    }
}