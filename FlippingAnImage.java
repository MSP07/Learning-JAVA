/*approach
  simulation, two pointers
  itearte through each row reverse it and reverse the 1's and 0's to
  0's and 1's respectively and return the matrix*/
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            int left = 0, right = row.length - 1;
            while(left <= right){
                if(left == right){
                    row[left] ^= 1; 
                }else{
                    int temp = row[left] ^ 1;
                    row[left] = row[right] ^ 1;
                    row[right] = temp;
                }
                left++;
                right--;
            }
        }
        return image;
    }
}
