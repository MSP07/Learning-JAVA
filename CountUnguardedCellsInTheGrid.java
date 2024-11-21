/*approach
  simulation, bfs
  we just follow the given instructions
  first construct a matrix with mxn dimensions and mark the indices of wall and guard with 1 and 2 respectively
  then we start iterating in all four directions the matrix if we reach the boundary or a guard or a wall we break
  else if there is an empty cell or unprotected cell in between them we mark that as protected. After this complete iteration
  we return the count of the unprotected cells or no of cells with matrix[i][j] = 0*/
class Solution{
    public int countUnguarded(int m,int n,int[][] guards,int[][] walls){
        int unguarded = 0;
        int[][] matrix = new int[m][n];
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        for(int[] guard:guards){
            matrix[guard[0]][guard[1]] = 1;
        }
        for(int[] wall:walls){
            matrix[wall[0]][wall[1]] = 2;
        }
        for(int[] guard:guards){
            for(int[] dir:dirs){
                int x = guard[0], y = guard[1];
                while(true){
                    x += dir[0];
                    y += dir[1];
                    if(x<0 || y<0 || x>=m || y>=n || matrix[x][y]==1 || matrix[x][y]==2){
                        break;
                    }
                    if(matrix[x][y]==0){
                        matrix[x][y] = 3;
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==0){
                        ++unguarded;
                    }
                }
            }
        }
        return unguarded;
    }
};
