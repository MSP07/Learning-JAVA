/*approach
  bit manipulation, hashmap
  we keep three hashmaps rows, cols, boxes
  each for checking repeated elements in their names
  for boxes we actually find the ind or rather the sub box that we r searching
  and if on any of these three hashmaps if there r repeated vals we return false
  and we update by bits and finally we return true*/
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                int num = board[i][j]-'1';
                int mask = 1 << num;
                int ind = (i/3)*3+j/3;
                if((rows[i] & mask)!=0 || (cols[j]&mask)!=0 || (boxes[ind]&mask)!=0)return false;
                rows[i] |= mask;
                cols[j] |= mask;
                boxes[ind] |= mask;
            }
        }
        return true;
    }
}
