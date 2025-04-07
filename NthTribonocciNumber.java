/*approach
  dp
  we declare base cases dp[0],dp[1],dp[2] as 0,1,1
  and we sum up dp[i] as dp[i-1]+dp[i-2]+dp[i-2] and finally
  the answer we will return in dp[n]*/
class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[38];
        dp[0] = 0; dp[1] = 1; dp[2] = 1;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}
