/*approach
  binary search
  first we take low as 1 and high as cars*cars*ranks[0] and perform
  binary search on them where carsrepair will be += sqrt(1.0*mid/rank)
  if low we shrink the search to mid+1,high else shrink to low,mid and
  finally return low*/
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 1, high = 1L * ranks[0] * cars * cars;
        while(low < high){
            long mid = (low + high) / 2, carsRepaired = 0;
            for(int rank : ranks) carsRepaired += (long) (Math.sqrt( (1.0 * mid) / rank));
            if(carsRepaired < cars) low = mid + 1;
            else high = mid; 
        }
        return low;
    }
}
