/*approach
  array
  we simply find the digit sum of every number using modulo
  and division method and keep track of the min one and finally return it*/
class Solution {
    private int digit(int num){
        int temp = 0;
        while(num>0){
            temp += num%10;
            num /= 10;
        }
        return temp;
    }
    public int minElement(int[] nums) {
        int mini = 10001;
        for(int num:nums){
            mini = Math.min(mini,digit(num));
        }
        return mini;
    }
}
