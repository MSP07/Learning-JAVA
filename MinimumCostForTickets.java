/*appraoch
  dp approach
  we start from first index and we have 3 possible costs 
  for 1 day, 7 days and 30 day. if we calculate for one day we take
  costs[0] and sum it with cost from next ind for 7 days we take costs[1]
  and sum of remaining part of tarvel if we take ind = 1 since we took for 7 days
  we will calculate remaining from ind = 8 (1+7) similarly for 30 days we take
  costs[2] and remainig part of vector and we finally return the min of all three
  we memoize and tabulate this*/
class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        int dp[] = new int[lastDay + 1];
        Arrays.fill(dp, 0);
        int i = 0;
        for (int day = 1; day <= lastDay; day++) {
            if (day < days[i]) {
                dp[day] = dp[day - 1];
            } else {
                i++;
                dp[day] = Math.min(dp[day - 1] + costs[0],Math.min(dp[Math.max(0, day - 7)] + costs[1],dp[Math.max(0, day - 30)] + costs[2]));
            }
        }
        return dp[lastDay];
    }
}
