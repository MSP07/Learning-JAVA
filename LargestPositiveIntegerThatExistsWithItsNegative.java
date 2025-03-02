/*approach
  hashmap, sorting
  we use set to take all the elements then we sort the array
  traverse from last since larger elements in the back and check
  for its negative in that set if there is negative element of that num
  then we return that num else finally we return -1*/
class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer>hashi = new HashSet<>();
        for(int num:nums){
            hashi.add(num);
        }
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            if(hashi.contains(-nums[i]))return nums[i];
        }
        return -1;
    }
}
