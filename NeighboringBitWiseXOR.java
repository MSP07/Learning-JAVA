/*apporach
  bit manipulation
  to achieve the given goal we can simply perform
  XOR on all elements and return if the final ans is 0
  if so we have same or even bits so that will return true else false*/
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xorr = 0;
        for(int ele:derived){
            xorr ^= ele;
        }
        return xorr == 0;
    }
}
