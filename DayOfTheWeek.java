/*approach
  we calculate whether the given year is leap year and
  accordingly calculate the day*/
class Solution {
    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
    }
    public String dayOfTheWeek(int day, int month, int year) {
        String[] s = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] m = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int d = day;
        for (int i=1;i<month;i++)d += m[i];
        if (isLeapYear(year) && month > 2)  d++;
        year--;
        d += (year+(year/4)-(year/100)+(year/400))%7;
        return s[(d)%7];
    }
}
