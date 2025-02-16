/*approach
  greedy,counting
  aim is to achieve the target[i]-nums[i] in min steps
  we take the diff and if the diff>0 then we take diff btn
  diff and incr, if the diff < 0 then we take diff btn decr and diff
  and reset the diff,decr,incr and finally return the ops*/
class Solution {
    public long minimumOperations(int[] nums, int[] target) {
        var n = nums.length;
        long incr = 0, decr = 0, ops = 0;
        for (var i = 0; i < n; i++) {
            var diff = target[i] - nums[i];
            if (diff > 0) {
                if (incr < diff)
                    ops += diff - incr;
                incr = diff;
                decr = 0;
            } else if (diff < 0) {
                if (diff < decr)
                    ops += decr - diff;
                decr = diff;
                incr = 0;
            } else {
                incr = decr = 0;
            }
        }
        return ops;
    }
}
