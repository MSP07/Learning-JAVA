/*approach
  sorting, hashmap
  first we add all the elements with their indices and sort them based on the elements 
  then we take the smallest or the first element and add it to the ans and then we mark
  the indices of index+1 and index-1 of that element's index to ensure that it does not go
  out of bound we take the max of (0,index-1) and min of (index+1,n-1) and finally return 
  the ans saving space and time*/
class Solution {
    public long findScore(int[] nums) {
        List<int[]>temp = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            temp.add(new int[]{nums[i],i});
        }
        long score = 0;
        Collections.sort(temp,(a,b)->Integer.compare(a[0],b[0]));
        boolean[] marked = new boolean[n];
        for(int[] arr:temp){
            if(!marked[arr[1]]){
                score += arr[0];
                marked[arr[1]] = true;
                marked[Math.max(0,arr[1]-1)]=true;
                marked[Math.min(arr[1]+1,n-1)]=true;
            }
        }
        return score;
    }
}
