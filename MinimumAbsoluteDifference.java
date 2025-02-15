/*approach
  sorting
  after sorting the first pair difference will be min diff
  and after that we compare consec pairs and if any matches the min diff
  we add that to ans vector and finally return it*/
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>ans = new ArrayList<>();
        int mini = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            mini = Math.min(mini,arr[i]-arr[i-1]);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==mini){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;
    }
}
