/*approach
  backtracking
  we rearrange the elements in nums and add them to our ans
  we do this by using backtracking. For given ind we re-arrange
  elements by swapping elements at the ind and at i for i iterations
  and then finally return the ans vector*/
class Solution{
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void fill(int ind,int[] nums,List<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer>temp = new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(nums,ind,i);
            fill(ind+1,nums,ans);
            swap(nums,ind,i);
        }
    }
    public List<List<Integer>>permutate(int[] nums){
        List<List<Integer>>ans = new ArrayList<>();
        fill(0,nums,ans);
        return ans;
    }
}
