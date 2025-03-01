/*approach
  array, simulation
  we keep a pointer at nums and iterate it two times
  first time we add the even num to even indices
  second time we add the odd num to odd indices
  finally returning the ans array*/
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0;
        for(int num:nums){
            if(num%2==0 && i<nums.length){
                ans[i] = num;
                i += 2;
            }
        }
        i = 1;
        for(int num:nums){
            if(num%2!=0 && i<nums.length){
                ans[i] = num;
                i += 2;
            }
        }
        return ans;
    }
}
