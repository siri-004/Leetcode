class Solution {
    public int dayOfYear(String date) {
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        String[] words=date.split("-");
        int year=Integer.parseInt(words[0]);
        int month=Integer.parseInt(words[1]);
        int day=Integer.parseInt(words[2]);
        int totaldays=0;
        if(year%400==0||(year%4==0&&year%100!=0)){
            days[1]=29;
        }
        for(int i=0;i<month-1;i++){
            totaldays+=days[i];
        }
        totaldays+=day;
        return totaldays;
    }

}