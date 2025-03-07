/*approach
  maths, permutation
  we use mathematical permutation to find the kth permutation
  first we take all the integer in nums array and we start with fact
  and with that we perform factorial permutation and return the kth permutation*/
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer>number = new ArrayList<>();
        int fact = 1;
        for(int i=1;i<=n;i++){
            number.add(i);
            fact *= i;
        }
        k--;
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            fact /= (n-i);
            int ind = k/fact;
            ans.append(number.get(ind));
            number.remove(ind);
            k %= fact;
        }
        return ans.toString();
    }
}
