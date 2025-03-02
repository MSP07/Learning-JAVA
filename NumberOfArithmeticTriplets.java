/*approach
  hashmap
  to solve this efficiently we use hashmap and we iterate in nums
  for each num if there is num+diff and num+2*diff then there is a triplet 
  so we increase the count and finally return it*/
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int cnt = 0;
        HashSet<Integer>hashi = new HashSet<>();
        for(int num:nums){
            hashi.add(num);
        }
        for(int i=0;i<nums.length;i++){
            if(hashi.contains(nums[i]+diff) && hashi.contains(nums[i]+2*diff)){
                cnt++;
            }
        }
        return cnt;
    }
}
