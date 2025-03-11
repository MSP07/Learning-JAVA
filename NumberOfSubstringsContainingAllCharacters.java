/*approach
  hashmap, sliding window
  to solve this efficiently we will maintain a hashmap of size 3
  whatever the chars encountered will be maintained as w.r.t their index
  and if all three chars(a,b,c) are seen we take the cnt of least occurence ones
  say aabbc here the least occurence count is 1 and thus 1 substring found and finally
  we return the count*/
class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int i = 0, cnt = 0;
        int[] hashi = {-1,-1,-1};
        while(i<n){
            hashi[s.charAt(i)-'a']=i;
            if(hashi[0]!=-1 && hashi[1]!=-1 && hashi[2]!=-1){
                cnt += 1 + Math.min(hashi[0],Math.min(hashi[1],hashi[2]));
            }
            i++;
        }
        return cnt;
    }
}
