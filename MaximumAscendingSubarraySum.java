/*approach
  array
  while iterating we take first element as base and check
  for ascending sequence if the sequence is ascending we add the element to the sum
  else we reset the sum to current element and we keep track of the max one and 
  finally return it*/
class Solution {
    public int maxAscendingSum(int[] nums) {
        if(nums.length==1)return nums[0];
        int maxSum = nums[0], currSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currSum += nums[i];
            }else{
                currSum = nums[i];
            }
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
