/*approach
  greedy
  we count the negatives same time calculating totalSum and finding minimum element with abs value
  if he negatives is even then we can somehow manipulate the matrix to give us the totalSum else
  we remove the min element two times since we have included that in totalSum while calculating total sum of matrix
  and apart from that we need to remove it again once and we finally return the totalSum*/
class Solution{
    public long maxMatrixSum(int[][] matrix){
        int negatives = 0;
        long min_abs_val = 100001;
        long totalSum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                totalSum += Math.abs(matrix[i][j]);
                if(matrix[i][j]<0){
                    ++negatives;
                }
                min_abs_val = Math.min(min_abs_val,Math.abs(matrix[i][j]));
            }
        }
        if(negatives%2!=0){
            totalSum -= 2*(min_abs_val);
        }
        return totalSum;
    }
}
