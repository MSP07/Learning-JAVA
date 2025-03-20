/*approach
  bit manipulation, maths
  we use the mathematical formula to find ith bit in gray code
  sequence g(i) = (i^(i>>1)), append it to array and return the res*/
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer>res = new ArrayList<>();
        int numElements = 1 << n;
        for(int i=0;i<numElements;i++){
            res.add(i^(i>>1));
        }
        return res;
    }
}
