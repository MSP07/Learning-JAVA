/*approach
  binary search
  idea is to find negative number in descending sorted matrix
  and we use binary search to find the num less than 0 and take a 
  count of that and finally return it*/
class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
