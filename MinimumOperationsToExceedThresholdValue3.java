/*approach
  priority queue, simulation
  with the help of priority queue(minheap) we take first two elements
  and do the given, increase the steps operation push them back
  to priority queue until the top element is less than k. if its
  greater then we return the steps as the req condition is met*/
class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        for(int i: nums){heap.add((long)i);}
        int count = 0;
        while(heap.peek() < k){
            long left = heap.poll();
            long right = heap.poll();
            heap.add(Math.min(left, right) *2   + Math.max(left, right));
            count++;
        }
        return count;
    }
}
