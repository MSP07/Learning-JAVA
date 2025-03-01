/*approach
  two pointers, simulation
  we first change the given array as per rules and then we take one pointer at
  start and swap the non zero element with that pointer element and increase the pointer
  and finally return the modified array saving space*/
class Solution {
    private void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }else continue;
        }
        int l = 0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                swap(r,l,nums);
                l++;
            }
        }
        return nums;
    }
}
