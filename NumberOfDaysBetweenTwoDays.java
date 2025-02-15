/*approach
  string
  from the entire format we calculate how much leap year and accordingly take 
  365 or 366 days and add that many days to answer and add the remaining days
  and finally return the ans
  here we use API*/
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
}
