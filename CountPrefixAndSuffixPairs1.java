/*approach
  string, string matching
  given we need to find two strings wrods[i] and words[j] in
  words such that words[i] is both prefix and suffix of words[j]
  and i<j we can run two for loops for i<j condition and a bool function
  where we compare the prefix substring and suffix substring of the two strings
  if str1.size() > str2.size() we return false and we return true if str1 is both
  prefix and suffix and we keep count of such pairs and return it*/
class Solution{
    private boolean isPrefixAndSuffix(String str1,String str2){
        if(str1.length()>str2.length())return false;
        if(!str2.startsWith(str1))return false;
        if(!str2.endsWith(str2))return false;
        return true;
    }
    
    public int countPrefixSuffixPairs(String[] words){
        int indices = 0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i],words[j]))indices++;
            }
        }
        return indices;
    }
}
