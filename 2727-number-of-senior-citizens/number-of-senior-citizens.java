class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++){
            String s = details[i];
            String temp = ""+s.charAt(11)+s.charAt(12); //:)
            int age = Integer.parseInt(temp);
            System.out.println(age);
            if(age>60) count++;
        }
        return count;
    }
}