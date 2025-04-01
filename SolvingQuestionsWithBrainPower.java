/*approach
  dp, tabulation
  we will use take notTake method here we try out all possible
  combos either we take the current element and brainpower and skip the next
  brainpower elements taking curr [i][0] else we skip and go to next element
  and finally return the max of take and notTake*/
class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n+1];
        for(int i=n-1;i>=0;i--){
            long notTake = dp[i+1];
            int next = i + questions[i][1] + 1;
            long take = questions[i][0] + (next > n ? 0 : dp[next]);
            dp[i] = Math.max(take,notTake);
        }
        return dp[0];
    }
}
