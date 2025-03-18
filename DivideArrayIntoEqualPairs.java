/*approach
  sorting,hashmap
  if to solve in 0(1) space complexity we can first
  sort the given array and then check if adj elements are same for every pair
  if not for any instance return false else finally return true*/
class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]!=nums[i+1])return false;
        }
        return true;
    }
}
