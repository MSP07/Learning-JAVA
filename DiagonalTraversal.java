/*approach
  simulation, matrix
  we simply follow the given rules and form the vector*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        boolean dir = true;
        int [] result = new int [m*n];
        int r = 0, c = 0;
        for(int i=0;i<result.length;i++){
            result[i] = mat[r][c];
            if(dir){
                if(r == 0 && c != n - 1){
                    c++;
                    dir = false;
                }else if(c == n -1){
                    r++;
                    dir = false;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(c == 0 && r != m - 1){
                    r++;
                    dir = true;
                }else if(r == m -1){
                    c++;
                    dir = true;
                }else{
                    c--;
                    r++;
                }
            }
        }
        return result;
    }
};
