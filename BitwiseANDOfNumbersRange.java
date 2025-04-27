/*approach
  bit manipulation
  AND between numbers of given two ranges is nothing but the shifting
  of each end limits by 1 and counting the nums in between them and finally
  shifting the bits in left by that cnt and returning that*/
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans = 0;
        while(left!=right){
            left >>= 1;
            right >>= 1;
            ans++;
        }
        return (left<<ans);
    }
}
