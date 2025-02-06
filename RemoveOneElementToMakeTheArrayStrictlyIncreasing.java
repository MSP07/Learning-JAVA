/*approach
  counting
  we keep a boolean flag to keep a track of whether elements are swapped
  then we change the element where nums[i] > nums[i-1] or nums[i-2] and 
  we swap that time and change the bool flag if the flag is already marked 
  for any future element we simply return false else finally we return true*/
class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int prev = nums[0];
        boolean used = false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=prev){
                if(used==true){
                    return false;
                }
                used = true;
                if(i==1 || nums[i]>nums[i-2]){
                    prev = nums[i];
                }
            }else{
                prev = nums[i];
            }
        }
        return true;
    }
}
