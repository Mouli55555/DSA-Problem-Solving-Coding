class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minTime = Integer.MAX_VALUE;

        int n = landStartTime.length;
        int m = waterStartTime.length;

        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < m; j++) { 

                int finishLand = landStartTime[i] + landDuration[i];
                int startWaterAfterLand = Math.max(finishLand, waterStartTime[j]); //:)
                int totalTime1 = startWaterAfterLand + waterDuration[j];

                int finishWater = waterStartTime[j] + waterDuration[j];
                int startLandAfterWater = Math.max(finishWater, landStartTime[i]);
                int totalTime2 = startLandAfterWater + landDuration[i];

                minTime = Math.min(minTime, Math.min(totalTime1, totalTime2));
            }
        }

        return minTime;
    }
}
