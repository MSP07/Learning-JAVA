/*approach
  hashmap
  instead of counting bad pairs which are j-i != nums[j]-nums[i[
  for optimality purpose we count the good pairs that are j-i = nums[j]-nums[i]
  which can be written as nums[i]-i = nums[j]-j and finally subtract them from
  from the total number of pairs possible which is n*(n-1)/2. for every nums[i]
  we calculate nums[i]-i and the count that we have stored in hashmap we increase the
  goodpair count by that much times and by default increase the count of that key in hashmap
  and finally return total-good*/
class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer,Long>hashi = new HashMap<>();
        long n = nums.length;
        long total = (n*(n-1))/2;
        long good = 0;
        for(int i=0;i<n;i++){
            int key = nums[i]-i;
            if(hashi.containsKey(key)){
                good += hashi.get(key);
            }
            hashi.put(key,hashi.getOrDefault(key,0L)+1);
        }
        return total-good;
    }
}
