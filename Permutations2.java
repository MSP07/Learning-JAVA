/*approach
  backtracking, hashmap
  the idea is to backtrack swap elements and add them recursively
  in the ans while checking whether the element at that particular index
  has already swapped, if so we continue else we add that element to hashmap
  and finally return the ans vector/list*/
class Solution {
    private void swap(int[] nums,int ind,int i){
        int temp = nums[ind];
        nums[ind] = nums[i];
        nums[i] = temp;
    }
    private void fill(int ind,int[] nums,List<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        Set<Integer>seen = new HashSet<>();
        for(int i=ind;i<nums.length;i++){
            if(seen.contains(nums[i]))continue;
            seen.add(nums[i]);
            swap(nums,ind,i);
            fill(ind+1,nums,ans);
            swap(nums,ind,i);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        fill(0,nums,ans);
        return ans;
    }
}
