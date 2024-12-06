/*approach
  sorting, binary search
  we can use a hashmap to store banned elements and iterate from 1 to n
  while finding elements that are not in the list and add them to sum before it exceeds maxSum
  and also incr count and if it does we break the loop and finally return the count
  to optimize this more we can neglect hashmap and sort the banned elements and use binary search
  to find the banned element instead of lookup this will be optimal based on language in c++
  this binary search is optimal whereas in java we use hashmap approach where lookup is optimal*/
class Solution{
    public int maxCount(int[] banned,int n,int maxSum){
        Set<Integer>hashi = new HashSet<>();
        int sum=0,count=0;
        for(int i=0;i<banned.length;i++){
            hashi.add(banned[i]);
        }
        for(int i=1;i<=n;i++){
            if(hashi.contains(i))continue;
            if(sum+i>maxSum)break;
            sum+=i;
            count++;
        }
        return count;
    }
}
