/*approach
  hashmap,counting
  idea is to find the element that has occured twice 
  in both the arrays till the given index we can achieve this
  by keeping track of elements at both the A and B and while counting
  the element if the count if 2 we increase the cnt variable and at the end
  that will be the array's ith element and finally return the ans array*/
class Solution{
    public int[] findThePrefixCommonArray(int[] A,int[] B){
        int n = A.length;
        int[] freq = new int[n+1];
        int[] ans = new int[n];
        int cnt = 0;
        for(int i=0;i<n;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2){
                cnt++;
            }
            freq[B[i]]++;
            if(freq[B[i]]==2){
                cnt++;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}
