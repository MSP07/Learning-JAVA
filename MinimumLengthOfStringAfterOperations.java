/*approach
  string, counting, hashmap
  as per the given conditions we need to find char such that
  the same char exists in left and right and we remove the left and
  right char. Optimal way to solve this will be is to count the same chars
  if the count is odd then after all operations one of that char will remain
  whereas if count is even then two of that will remain. To save space we take 
  int array consisting 26 spaces indicating 26 chars and we operate on that keeping
  track of the char in final string and returning it*/
class Solution{
    public int minimumLength(String s){
        int n = s.length();
        if(n<=2)return n;
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        int cnt = 0;
        for(int i=0;i<26;i++){
            if(freq[i]%2!=0 && freq[i]!=0){
                cnt++;
            }else if(freq[i]%2==0 && freq[i]!=0){
                cnt+=2;
            }
        }
        return cnt;
    }
}
