/*apporoach
  sorting, hashmap, two pointers
  we sort the given array so we can have smallest and largest
  element at any given time and we keep two pointers one at start  
  and another at end we calculate their average and add it to hash set
  and keep moving pointers when they are no more elements we return the 
  distinct elements present in the hash set*/
class Solution {
    public int distinctAverages(int[] nums) {
        if(nums.length==2)return 1;
        int l = 0, r = nums.length-1;
        Arrays.sort(nums);
        Set<Double>hashi = new HashSet<>();
        while(l<r){
            hashi.add(((double)nums[l]+nums[r])/2);
            l++;
            r--;
        }
        return hashi.size();
    }
}
