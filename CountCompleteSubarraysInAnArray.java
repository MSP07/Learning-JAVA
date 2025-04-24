/*approach
  hashmap,sliding window
  first we calculate total no of disinct using set and 
  we use sliding window technique to find that in the given subarray
  if the distinct elements count match then we take that subarray size since all
  the elements are possible and we decrease the count of left element by this method
  we iterate full array and finally return the count*/
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int totalDistinct = new HashSet<Integer>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new))).size();
        int count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            while(freq.size() == totalDistinct){
                count += (nums.length - right); 
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if(freq.get(nums[left]) == 0){
                    freq.remove(nums[left]);
                }
                left++;
            }
        }
        return count;
    }
}
