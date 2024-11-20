/*approach
  sliding window,hashmap
  we start from first index and keep adding the sum and inserting them into hashmap
  if we encounter a same element again or the window size is more than k we shrink the window
  and remove the element from sum and keep track of the maxSum encountered when the window size is k
  by this way in one iteration we can complete the problem efficiently and finally return the answer*/
class Solution{
    public long maximumSubarraySum(int[] nums,int k){
        int[] count = new int[100001];
        long currSum = 0, maxSum = 0;
        int left = 0;
        for(int right=0;right<nums.length;right++){
            currSum += nums[right];
            count[nums[right]]++;
            while(count[nums[right]]>1 || right-left+1 > k){
                currSum -= nums[left];
                count[nums[left]]--;
                left++;
            }
            if(right-left+1==k){
                maxSum = Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }
};
