/*approach
  two pointers, matrix
  we iterate and on each row we start the last element and we keep that as the empty one
  now we iterate backwards in the row and if we come across an obstacle we mark that as our new empty
  else if we come across a stone then we make that element as '.' and the nearest empty(that we have marked)
  will be changed to stone. After the whole rearranging of stones we create a new matrix that is 90 degrees
  to this matrix and return it*/
class Solution{
    public char[][] rotateTheBox(char[][] box){
        int n = box.length, m = box[0].length;
        char[][] matrix = new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = '.';
            }
        }
        for(int i=0;i<n;i++){
            int empty = m-1;
            for(int j=m-1;j>=0;j--){
                if(box[i][j]=='*'){
                    matrix[j][n-i-1] = '*';
                    empty = j-1;
                }else if(box[i][j]=='#'){
                    matrix[empty--][n-i-1] = box[i][j];
                }
            }
        }
        return matrix;
    }
};
