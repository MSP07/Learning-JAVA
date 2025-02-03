/*approach
  array
  we simply calculate the total sum of elements and 
  element sum or the digit sum of all elements in the array
  using divisor and modulo method and finally return the abs between them*/
class Solution {
    private int diff(int[] nums){
        int ans = 0;
        for(int num:nums){
            while(num>0){
                ans += num%10;
                num /= 10;
            }
        }
        return ans;
    }
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        return Math.abs(sum-diff(nums));
    }
}
