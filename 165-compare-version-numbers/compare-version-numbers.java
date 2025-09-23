class Solution {
    public int compareVersion(String version1, String version2) {  //:)
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int ptr = 0;
        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
        while(ptr<v1.length && ptr<v2.length){
            int val1 = Integer.parseInt(v1[ptr]);
            int val2 = Integer.parseInt(v2[ptr]);
            if(val1<val2){
                return -1;
            }else if(val1>val2){
                return 1;
            }
            ptr++;
        } 
        while(ptr<v1.length){
            int val = Integer.parseInt(v1[ptr]);
            if(val>0) return 1;
            ptr++;
        }
        while(ptr<v2.length){
            int val = Integer.parseInt(v2[ptr]);
            if(val>0) return -1;
            ptr++;
        }
        return 0;
    }
}