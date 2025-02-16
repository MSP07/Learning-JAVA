/*approach
  sorting,hashmap
  we sort the array and find the smaller numbers than the current number
  we use hashmap to store the indices with the numbers and then we 
  tahe the count from the hashmap store it in array and return it*/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        Map<Integer, Integer> rank = new HashMap<>();
        for (int i = 0; i < sortedNums.length; i++) {
            rank.putIfAbsent(sortedNums[i], i);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = rank.get(nums[i]);
        }
        return result;
    }
}
