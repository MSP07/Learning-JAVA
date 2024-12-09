/*approach
  prefixSum
  first we calculate whether consec elements are of same parity and store them in a vector
  then we calculate their prefixSum we do this so as to check for parity in start and end
  elements then while iterating in the queries for every query we take from,to and calculate
  their diff in parities if their diff is 0 then they are of diff parities else with same
  parities so we append true or false accordingly and finally return the ans vector*/
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] parity = new int[n-1];
        for(int i=0;i<n-1;i++){
            parity[i] = (nums[i]%2 == nums[i+1]%2) ? 1 : 0;
        }
        int[] prefixSum = new int[n];
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + parity[i-1];
        }
        boolean[] ans = new boolean[queries.length];
        for(int i=0;i<queries.length;i++){
            int from = queries[i][0], to = queries[i][1];
            if(from==to){
                ans[i] = true;
            }else{
                int temp = prefixSum[to]-prefixSum[from];
                ans[i] = (temp==0) ? true : false;
            }
        }
        return ans;
    }
}
