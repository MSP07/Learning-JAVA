/*approach
  array
  we keep one num and with that we track other two keep track of max
  one and finally return it*/
class Solution {
    public long maximumTripletValue(int[] nums) {
        long y = 0, x = 0, ans = 0;
        for(int num:nums){
            ans = Math.max(ans,x*num);
            x = Math.max(y-num,x);
            y = Math.max(y,num);
        }
        return ans;
    }
}
