/*approach
  greedy,counting
  we need to count steps when we encounter 0 and when 1 is adj to it
  such that no 1's are in the back and we need to move it to the back
  we can accomplish by starting count with 0 if 1's are already in back   
  no need to push them back so 0 remains same and then we iterate the pointer to
  the next 1 and increase the count and add that count to our ans and finally return it*/
class Solution {
    public int maxOperations(String s) {
        int ans = 0, cnt = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                ans += cnt;
                while(i<n && s.charAt(i)!='1'){
                    i++;
                }
            }
            cnt++;
        }
        return ans;
    }
}
