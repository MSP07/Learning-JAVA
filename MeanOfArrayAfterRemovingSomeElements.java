/*approach
  sorting
  to find the mean we first sort then find the 5 percent
  and we only sum the between elements excluding first 5 percent
  and last 5 percent and keep track of size finally returning the sum/cnt*/
class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double ans = 0;
        int cnt = 0;
        int begin = (int)(arr.length*0.05);
        for(int i=begin;i<arr.length-begin;i++){
            ans += arr[i];
            cnt++;
        }
        return ans/cnt;
    }
}
