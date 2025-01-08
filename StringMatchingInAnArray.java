/*approach
  string, string matching
  we use a set and find whether the words inside are subarrays
  if so we add them to ans and break to prevent duplicates*/
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[j].contains(words[i])){
                    ans.add(words[i]);
                    break;
                }
            }
        }
        return ans;
    }
}
