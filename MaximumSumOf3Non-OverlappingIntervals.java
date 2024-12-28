/*approach
  sliding window, dp
  We calculate all subarray sums of size k using a sliding window technique.
  left[i]: Tracks the index of the best subarray (maximum sum) from index 0 to i.
  right[i]: Tracks the index of the best subarray (maximum sum) from indexi to the end.
  For each possible middle subarray, use the precomputed left and right indices to calculate
  the total sum of three non-overlapping subarrays*/
class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] subarray_sum = new int[n-k+1];
        int curr_sum = 0;
        for(int i=0;i<k;i++){
            curr_sum += nums[i];
        }
        subarray_sum[0] = curr_sum;
        for(int i=1;i<=n-k;i++){
            curr_sum += nums[i+k-1]-nums[i-1];
            subarray_sum[i] = curr_sum;
        }
        int[] left = new int[n-k+1];
        int[] right = new int[n-k+1];
        int best_left = 0;
        for(int i=0;i<=n-k;i++){
            if(subarray_sum[i]>subarray_sum[best_left]){
                best_left = i;
            }
            left[i] = best_left;
        }
        int best_right = n-k;
        for(int i=n-k;i>=0;i--){
            if(subarray_sum[i]>=subarray_sum[best_right]){
                best_right = i;
            }
            right[i] = best_right;
        }
        int max_sum = 0;
        int[] result = new int[3];
        for(int mid=k;mid<=n-2*k;mid++){
            int l = left[mid-k];
            int r = right[mid+k];
            int total = subarray_sum[l] + subarray_sum[mid] + subarray_sum[r];
            if(total>max_sum){
                max_sum = total;
                result[0] = l;result[1] = mid;result[2]=r;
            }
        }
        return result;
    }
}
