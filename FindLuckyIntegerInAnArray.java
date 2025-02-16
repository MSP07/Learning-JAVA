/*approach
  hashmap,counting
  we keep a hashmap to keep track of the no of times 
  a number has occured in the array and we iterate in that
  hashmap and if num == count then we keep track of the max one*/
class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxLucky = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                maxLucky = Math.max(maxLucky, entry.getKey());
            }
        }
        return maxLucky;
    }
}
