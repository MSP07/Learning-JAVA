/*approach
  dfs, matrix
  aim to count the max fish in a surrounding region and we can
  achieve this by using dfs similar to flood fill problem and
  we mark the cells that are visited and calculate in neighborhood
  if there is any fish if so we sum them up and keep track of max one
  finally returning it*/
class Solution {
    int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
    private int dfs(int i,int j,int[][] grid){
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]==0)return 0;
        int ans = grid[i][j];
        grid[i][j] = 0;
        for(int[] dir:dirs){
            ans += dfs(i+dir[0],j+dir[1],grid);
        }
        return ans;
    }
    public int findMaxFish(int[][] grid) {
        int fishes = -1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>0){
                    fishes = Math.max(fishes,dfs(i,j,grid));
                }
            }
        }
        return fishes == -1 ? 0 : fishes;
    }
}
