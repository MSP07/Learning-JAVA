/*approach
  sorting, simulation
  goal is to take highest in each row and sum it up so we sort each row in descending order
  then take the highest of that particular column and add it to ans then iterate and finally 
  return the ans*/
class Solution{
    private void reverse(int[] nums){
        int left = 0,right=nums.length-1;
        while(left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    public int deleteGreatestValue(int[][] grid){
        int n=grid.length,m=grid[0].length;
        int ans = 0;
        for(int i=0;i<n;i++){
            Arrays.sort(grid[i]);
            reverse(grid[i]);
        }
        for(int i=0;i<m;i++){
            int maxi = 0;
            for(int j=0;j<n;j++){
                maxi = Math.max(maxi,grid[j][i]);
            }
            ans += maxi;
        }
        return ans;
    }
}
