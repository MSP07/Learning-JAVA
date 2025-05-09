/*approach
  binary search, hashmap, sliding window
  we start by checking whether the count of all chars are one using linear
  search if so we return -1 else we do a binary search on the chars from extreme
  ends and we shrink the window for each char we check whether the count is already > 2 
  if so we have one substring that occurs 3 times we check for any other by increasing the 
  left pointer to mid else we decrease the right pointer to mid indicating we need to find
  a substring that occurs three times and that is not in the right half and finally return 
  the left pointer as this will point to the answer due to property of opp polarity*/
class Solution{
    private boolean helper(String s,int n,int mid){
        int[] cnt = new int[26];
        int j = 0;
        for(int i=0;i<n;i++){
            while(s.charAt(j)!=s.charAt(i))j++;
            if(i-j+1>=mid)cnt[s.charAt(i)-'a']++;
            if(cnt[s.charAt(i)-'a']>2)return true;
        }
        return false;
    }
    public int maximumLength(String s){
        int n = s.length();
        int left=1,right=n;
        if(!helper(s,n,left))return -1;
        while(left<right){
            int mid = (left+right)/2;
            if(helper(s,n,mid))left=mid;
            else right=mid;
        }
        return left;
    }
}
