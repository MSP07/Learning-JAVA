/*approach
  hashmap, counting
  to make k palindromes we must ensure that the chars present
  either are all even in number or if its odd then k must be greater
  than that odd count. So we first using hashmap count the occurences of
  chars and if its odd then we check whether the odd is less than k*/
class Solution{
    public boolean canConstruct(String s,int k){
        if(k>s.length())return false;
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int odd = 0;
        for(int cnt:freq){
            if(cnt%2!=0){
                odd++;
            }
        }
        return k >= odd;
    }
}
