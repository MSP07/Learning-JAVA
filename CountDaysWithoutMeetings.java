/*approach
  sorting
  we first sort the given array and the start and end will be[0] and [1] element
  we will count free as start-latest-1 and keep track of max latest and finally
  add days-latest to the free variable and return the free as ans*/
class Solution {
    public int countDays(int days, int[][] meetings) {
        int freeDays = 0, latestEnd = 0;
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        for(int[] meeting : meetings){
            int start = meeting[0], end = meeting[1];
            if(start > latestEnd + 1){
                freeDays += start - latestEnd - 1;
            }
            latestEnd = Math.max(latestEnd, end);
        }
        freeDays += days - latestEnd;
        return freeDays;
    }
}
