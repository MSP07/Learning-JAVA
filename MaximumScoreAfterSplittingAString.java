/*approach
  string, prefixSum
  since it is given the string consists of either 0 or 1
  we first calculate the ones in whole string and when we iterate
  from left to right till end-1 we decrease ones count if we encounter '1'
  else we increase count of zeroes and then we keep track of max(zeroes+ones)
  and finally return it*/
class Solution{
    public int maxScore(String s){
        int ones = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        int ans = 0;
        int zeroes = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='1'){
                ones--;
            }else{
                zeroes++;
            }
            ans = Math.max(ans,zeroes+ones);
        }
        return ans;
    }
}
