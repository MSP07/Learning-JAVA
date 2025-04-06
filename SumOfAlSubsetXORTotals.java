/*approach
  bit manipulation
  to get XOR of all subsets we simply calculate XOR of all elements
  and then shift their bit w.r.t size of nums and return it*/
class Solution {
    public int subsetXORSum(int[] nums) {
        int ans = 0;
        for(int num:nums){
            ans |= num;
        }
        return ans << (nums.length-1);
    }
}
