class Solution {
    public int reverseDegree(String s) {
        String[][] arr = {
                {"a", "26"}, {"b", "25"}, {"c", "24"}, {"d", "23"}, {"e", "22"},   //:)
                {"f", "21"}, {"g", "20"}, {"h", "19"}, {"i", "18"}, {"j", "17"},
                {"k", "16"}, {"l", "15"}, {"m", "14"}, {"n", "13"}, {"o", "12"},
                {"p", "11"}, {"q", "10"}, {"r", "9"},  {"s", "8"},  {"t", "7"},
                {"u", "6"},  {"v", "5"},  {"w", "4"},  {"x", "3"},  {"y", "2"},
                {"z", "1"}
        };

        int sum = 0;
        for(int i=0;i<s.length();i++){
            String x = s.charAt(i)+"";
            String n1 = "";
            for(int j=0;j<26;j++){
                if(arr[j][0].equals(x)) n1= arr[j][1];
            }
            int n2 = Integer.parseInt(n1);
            sum+=(n2*(i+1));
        }
        return sum;
    }
}