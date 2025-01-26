/*approach
  sorting
  first we sort the num with their indices not to lose track
  and then we group and store them in new array with the help of
  limit and then we sort with indices again to make sure lexographically
  they remain same and finaly with that we assign values and return ans array*/
class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] indexedNums = new int[n][2]; 
        for (int i=0;i<n;i++){
            indexedNums[i] = new int[]{nums[i], i};
        }
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));
        int[] result = new int[n];
        int i = 0;
        while (i < n) {
            int j = i;
            List<Integer> indices = new ArrayList<>();
            List<Integer> values = new ArrayList<>();
            while (j < n && (j == i || indexedNums[j][0] - indexedNums[j - 1][0] <= limit)) {
                indices.add(indexedNums[j][1]);
                values.add(indexedNums[j][0]);
                j++;
            }
            Collections.sort(indices);
            for (int k = 0; k < indices.size(); k++) {
                result[indices.get(k)] = values.get(k);
            }
            i = j;  
        }
        return result;
    }
}
