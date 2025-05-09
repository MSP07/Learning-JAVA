/*approach
  string, simulation
  we simply start iterating in the string and we add the sum in reverse order
  while multiplying (i+1) and finally return it*/
class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            sum += (26-(s.charAt(i)-'a'))*(i+1);
        }
        return sum;
    }
}
