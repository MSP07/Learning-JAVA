/*approach
  hashmap
  keep a hashmap to keep track of seen elements and their indices and calc
  if target-nums[i] is seen before is so we found a pair we can return it
  else we push the nums[i] with its index and keep iterating, if not found any return {}*/
class Solution{
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer>mpp = new HashMap<>();
        for(int i=0;i<length;i++){
            int toFind = target - nums[i];
            if(mpp.containsKey(toFind)){
                return new int[] {mpp.get(toFind),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[] {};
    }
};
