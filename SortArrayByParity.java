/*approach
  two pointers
  we keep two pointers one at start and other iterating
  if we come across a even numbers we swap it with the first pointer
  and increment that pointer and finally return the modified array*/
class Solution {
    private void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1)return nums;
        int l = 0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2==0){
                swap(l,r,nums);
                l++;
            }
        }
        return nums;
    }
}
