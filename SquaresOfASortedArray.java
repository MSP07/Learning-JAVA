/*approach
  two pointers
  instead of squaring each element sorting and returning
  we can use two pointers to compare the abs greater element
  square it add it to last index and move from last and if we encounter same val with diff indices
  we add the swaured nums twice else we add it once and finally return the new array*/
class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums.length==1)return new int[]{nums[0]*nums[0]};
        int[] ans = new int[nums.length];
        int l = 0, r = nums.length-1;
        int i = nums.length-1;
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                ans[i--] = nums[l]*nums[l];
                l++;
            }else{
                ans[i--] = nums[r]*nums[r];
                r--;
            }
        }
        return ans;
    }
}
