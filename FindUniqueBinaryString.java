/*approach
  backtracking,bit manipulation,string
  in backtracking we try all possible combos and return immediately the one that is
  not present in nums, in bit manipulation we do the same we try all possibilities with 
  the help of bits finally the optimized string approach is based on the fact that 
  nums.length == nums[i].length so to get a new one that is not present in nums we simply 
  change the nums[i][i] bit to its opposite that is nums[i][i] == '0' ? '1' : '0' and return the final string*/
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            ans.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }
        return ans.toString();
    }
}
