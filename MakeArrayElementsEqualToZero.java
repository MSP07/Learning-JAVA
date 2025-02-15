/*approach
  array
  we simply add 2 if the last element is 2 times of curr element 
  when the curr is 0 indicating the last element should also be zero 
  else if their diff is 1 we add 1 and finally return the ans*/
class Solution{
    public int countValidSelections(int[] nums){
        int n = nums.length;
        int[] temp = new int[n+1];
        int ans = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                if(temp[n]==2*temp[i]){
                    ans += 2;
                }else if(temp[n]-2*temp[i]==1){
                    ans += 1;
                }
            }
        }
        return ans;
    }
}
