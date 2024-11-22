/*approach
  simulation
  we simply follow the given rules and keep row and col seperately
  we increase the row[given index], col[given index] and from these row and col
  we calculate the no of odds and return it*/
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] index:indices){
            row[index[0]]++;
            col[index[1]]++;
        }
        int odd = 0, even = 0;
        for(int r:row){
            if(r%2!=0)odd++;
        }
        for(int c:col){
            if(c%2!=0)even++;
        }
        return odd*(n-even)+even*(m-odd);
    }
}
