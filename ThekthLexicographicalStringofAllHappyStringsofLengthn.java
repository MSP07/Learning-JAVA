/*approach
  backtracking, string
  first we start off with 'a','b','c' and till we reach n
  we check whether the last char added is one of these if not we add one of these char
  and again with that new string we do the whole process again till we reach at n and when we 
  reach n only if k is 0 (we reduce k for each time we reach n) then we return the string as the answer
  finally if there is a string then we have answer else we return ""*/
class Solution {
    private void backtrack(int n, StringBuilder current, List<String> happyStrings, int[] k) {
        if(current.length() == n){
            k[0]--;
            if(k[0] == 0){
                happyStrings.add(current.toString());
            }
            return;
        }
        for(char ch : new char[]{'a', 'b', 'c'}){
            if(current.length() == 0 || current.charAt(current.length() - 1) != ch){
                current.append(ch);
                backtrack(n, current, happyStrings, k);
                current.deleteCharAt(current.length() - 1);
                if (k[0] == 0) return;
            }
        }
    }
    public String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        int[] count = {k};
        backtrack(n, new StringBuilder(), happyStrings, count);
        return happyStrings.isEmpty() ? "" : happyStrings.get(0);
    }
}
