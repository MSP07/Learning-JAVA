/*approach
  string, string matching
  we check whether any of word in words start with prefix
  keep a count and return it*/
class Solution{
    public int prefixCount(String[] words,String pref){
        int cnt = 0;
        for(String word:words){
            if(word.startsWith(pref)){
                cnt++;
            }
        }
        return cnt;
    }
}
