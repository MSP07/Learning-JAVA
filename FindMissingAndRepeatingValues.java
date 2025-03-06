/*approach
  hashmap, simulation
  iterate through each vector in grid and keep the count of the num in a hashmap of size n*n + 1
  again iterate through the hashmap and if count is 0 it is missing and if count is 2 it is repeating
  we finally return that {repeating,missing}*/
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n*n+1];
        for(int[] gr:grid){
            for(int num:gr){
                freq[num]++;
            }
        }
        int missing = -1, repeating = -1;
        for(int i=1;i<freq.length;i++){
            if(freq[i]==0){
                missing = i;
            }else if(freq[i]==2){
                repeating = i;
            }
        }
        return new int[]{repeating,missing};
    }
}
