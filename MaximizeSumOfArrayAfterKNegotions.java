/*approach
  array, greedy, sorting
  to achieve this goal first we sort so we can get the smaller
  elements at the first and till k we iterate through the sorted 
  array changing negative elements to positive so as to maximize the sum
  and if k is odd then we flip the smallest number again we do this by
  sorting again and flipping the first number and finally return the sum*/
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length && k>0;i++){
            if(nums[i]<0){
                nums[i] = -nums[i];
                k--;
            }
        }
        Arrays.sort(nums);
        if(k%2==1){
            nums[0] = -nums[0];
        }
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans += nums[i];
        }
        return ans;
    }
}
