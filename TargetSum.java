/*approach
  here we make the problem to +(set1)-(set2)=target
  and find whether there is a val such that total sum - target / 2 + target
  is available and update the dp array with the no of such counts*/
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total_sum = 0;
        for(int num:nums){
            total_sum += num;
        }
        if((total_sum-target)%2!=0)return 0;
        int req_sum = (total_sum-target)/2+target;
        if(req_sum<0)return 0;
        int[] dp = new int[req_sum+1];
        dp[0]=1;
        for(int i:nums){
            for(int j=req_sum;j>=i;j--){
                dp[j] += dp[j-i];
            }
        }
        return dp[req_sum];
    }
}
