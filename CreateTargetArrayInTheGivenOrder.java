/*approach
  simulation
  we insert the nums[index[i]] at the index i to prevent replacing 
  the element in that index we use the insert function*/
class Solution{
    public int[] createTargetArray(int[] index,int[] nums){
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<index.length;i++){
            ans.add(index[i],nums[i]);
        }
        int n = ans.size();
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}
