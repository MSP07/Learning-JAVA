/*approach
  two pointers, deque, sliding window
  we can use two deques to keep track of max element and min element
  in the given window with the sliding window condition max-min <= 2
  we can expand the window from right or j pointer and shrink it in the
  left or i pointer as necessary. For every valid window we incr the count*/
class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        long count = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[j]) {
                maxDeque.pollLast();
            }
            maxDeque.addLast(j);
            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[j]) {
                minDeque.pollLast();
            }
            minDeque.addLast(j);
            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > 2) {
                if (maxDeque.peekFirst() == i) maxDeque.pollFirst();
                if (minDeque.peekFirst() == i) minDeque.pollFirst();
                i++;
            }
            count += (j - i + 1);
        }
        return count;
    }
}
