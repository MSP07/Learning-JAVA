/*approach
  hashmap
  we iterate through the loop and for each combination
  we add the element to a hashmap and the size of it is the count
  so we sum the square the size of the hashmap and finally return it*/
class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        for(int i=0;i<n;i++){
            Set<Integer>hashi = new HashSet<>();
            for(int j=i;j<n;j++){
                hashi.add(nums.get(j));
                int cnt = hashi.size();
                ans += (cnt*cnt);
            }
        }
        return ans;
    }
}
