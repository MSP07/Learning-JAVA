/*approach
  dp, memoization
  we try out all the possible chars adding in order of given s1 and s2
  if we reach the ends of them successfully we return true else we return false
  since there can be overlapping subproblems we use memoization*/
class Solution {
    private boolean solve(int i,int j,String s1,String s2,String s3,int[][] dp,int n,int m){
        if(i==n && j==m)return true;
        if(dp[i][j]!=-1)return dp[i][j] == 1;
        boolean res = false;
        if(i<n && s1.charAt(i)==s3.charAt(i+j)){
            res = solve(i+1,j,s1,s2,s3,dp,n,m);
        }
        if(!res && j<m && s2.charAt(j)==s3.charAt(i+j)){
            res = solve(i,j+1,s1,s2,s3,dp,n,m);
        }
        dp[i][j] = res ? 1 : 0;
        return res;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length();
        if(n+m!=s3.length())return false;
        int[][] dp = new int[n+1][m+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,s1,s2,s3,dp,n,m);
    }
}
