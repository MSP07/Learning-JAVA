/*approach
  two pointer, simulation
  we keep two pointers one at start and another at end 
  we convert them to string first to concatenate and convert them again
  to integer to take the sum and if the pointers or not at the centre or not equal
  we concatenate both nums[i] and nums[j] and move pointer else we append only nums[i]
  and finally return the sum*/
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int i = 0, j = nums.length-1;
        while(i<=j){
            StringBuilder help = new StringBuilder();
            if(i!=j){
                help.append(nums[i]).append(nums[j]);
                i++;j--;
            }else{
                help.append(nums[i]);
                i++;j--;
            }
            ans += Long.parseLong(help.toString());
        }
        return ans;
    }
}
