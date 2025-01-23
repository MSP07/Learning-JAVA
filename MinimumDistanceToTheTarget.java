/*approach
  array
  juat follow the instructions and keep track of min of abs(i-start) and finally return it*/
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int mini = 10001;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                mini = Math.min(mini,Math.abs(i-start));
            }
        }
        return mini;
    }
}
