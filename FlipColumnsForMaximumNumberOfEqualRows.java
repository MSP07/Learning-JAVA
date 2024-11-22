/*approach
  hashmap
  we iterate through the given matrix and we keep the first element in each row as  
  the base and we flip the remaining element w.r.t this cell and we build up a string
  from the flipped cells and we store this strings in a hashmap and keep track of the 
  max one and finally return it*/
class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
       Map<String, Integer> patternCount = new HashMap<>();
        int maxRows = 0;
        for (int[] row : matrix) {
            StringBuilder pattern = new StringBuilder();
            int base = row[0]; 
            for (int cell : row) {
                pattern.append(cell == base ? '0' : '1');
            }
            String normalizedPattern = pattern.toString();
            patternCount.put(normalizedPattern, patternCount.getOrDefault(normalizedPattern, 0) + 1);
            maxRows = Math.max(maxRows, patternCount.get(normalizedPattern));
        }
        return maxRows;
    }
}
