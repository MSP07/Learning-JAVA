/*approach
  matrix, prefix sum
  using the pre computed sum and the rules given
  we calculate the answer*/
class Solution {
    public long gridGame(int[][] grid) {
        long firstRowSum = 0;
        for (int value : grid[0]) {
            firstRowSum += value; 
        }
        long secondRowSum = 0;
        long minimumSum = Long.MAX_VALUE;
        for (int turnIndex = 0; turnIndex < grid[0].length; turnIndex++) {
            firstRowSum -= grid[0][turnIndex]; 
            minimumSum = Math.min(minimumSum, Math.max(firstRowSum, secondRowSum)); 
            secondRowSum += grid[1][turnIndex];
        }
        return minimumSum;
    }
}
