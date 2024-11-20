/*approach
  deque, sliding window, prefixSum
  first we store all the prefixSum and start iterating
  we check for the sum from both front and back and update the ans w.r.t the index
  and prefixSum and keep track of the min one. To implement this we use deque
  and finally return the min one, if no min exists we return -1*/
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long [] prefixSum = new long[n + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int ans = n + 1;
        for(int i = 0 ; i < n ; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
        for(int i = 0 ; i < n + 1 ; i++) {
            while(!dq.isEmpty() && (prefixSum[i] - prefixSum[dq.getFirst()] >= k)){
                ans = Math.min(ans, i - dq.pollFirst());
            }
            while(!dq.isEmpty() && prefixSum[dq.getLast()] >= prefixSum[i]) {
                dq.pollLast();
            }
            dq.addLast(i);
        }
        return ans == n + 1 ? -1 : ans;
    }
}
