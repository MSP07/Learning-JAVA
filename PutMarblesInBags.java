/*approach
  sorting
  first we take all the adj count and store it in an array
  then we sort that all the max min combination is only possible in this array
  after that the sum of first k-1 elements is the min sum overall and sum from 
  last k-1 elements is the max sum overall and we return the diff between them*/
class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int[] pairWeights = new int[n - 1];
        for(int i = 0;i < n - 1;++i){
            pairWeights[i] = weights[i] + weights[i + 1];
        }
        Arrays.sort(pairWeights, 0, n - 1);
        long answer = 0l;
        for(int i = 0; i < k - 1; ++i){
            answer += pairWeights[n - 2 - i] - pairWeights[i];
        }
        return answer;
    }
}
