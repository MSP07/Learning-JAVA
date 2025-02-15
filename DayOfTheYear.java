/*approach
  array
  take out date,year,month check for leap year then change the days array
  then add the no of days till the month has arrived and return the day*/
class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29; 
        }
        int ans = day;
        for (int i = 0; i < month - 1; i++) {
            ans += daysInMonth[i];
        }
        return ans;
    }
}
