class Solution {
    public String convertDateToBinary(String date) {    //:)
        StringBuffer sb = new StringBuffer();
        String[] temp = date.split("-");
        int year = Integer.parseInt(temp[0]);
        int month = Integer.parseInt(temp[1]);
        int day = Integer.parseInt(temp[2]);
        String Syear = Integer.toBinaryString(year);
        String Smonth = Integer.toBinaryString(month);
        String Sday = Integer.toBinaryString(day);
        sb.append(Syear).append("-").append(Smonth).append("-").append(Sday);
        return sb.toString();
    }
}