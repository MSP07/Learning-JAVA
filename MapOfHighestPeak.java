/*approach
  bfs, matrix, backtracking
  since the goal is to find highest land from water
  we start by declaring and initating the constant that is water
  then we push the indices of the water cell into queue. Now from this
  position whichever land is near in adj four direction we update that distance
  and push their indices as new starting point. This works because the water cell is 0
  and so the immediate neighboring cells will be 0+1 which will be 1 but after that if the 
  indices remain same then for other cells also the distance will be 0+1 which will be 1 so to
  prevent that since the new updated distance will be +1+1+1..... so on we push their indices
  as new indices in the queue*/
class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length, m = isWater[0].length;
        int[][] height = new int[n][m];
        for (int[] row : height) {
            Arrays.fill(row, -1);
        }
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isWater[i][j] == 1) {
                    height[i][j] = 0;
                    q.add(new int[] {i, j});
                }
            }
        }
        int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int i = cell[0], j = cell[1];
            for (int[] dir : directions) {
                int x = i + dir[0], y = j + dir[1];
                if (x >= 0 && x < n && y >= 0 && y < m && height[x][y] == -1) {
                    height[x][y] = height[i][j] + 1;
                    q.add(new int[] {x, y});
                }
            }
        }
        return height;
    }
}
