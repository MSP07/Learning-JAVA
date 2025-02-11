/*approach
  stack,string
  to solve this optimally we use a string ans
  and iterate through the given string and if the char we r iterating
  is a digit and at the same time if the ans is not empty we pop the last
  char we appended we continue this to ensure we get only char as ans and
  finally return the ans string*/
class Solution {
    private boolean isDigit(char c){
        return c >= '0' && c<='9';
    }
    public String clearDigits(String s) {
        StringBuilder ans = new StringBuilder();
        for(char c:s.toCharArray()){
            if(isDigit(c) && ans.length()>0){
                ans.deleteCharAt(ans.length()-1);
                continue;
            }
            ans.append(c);
        }
        return ans.toString();
    }
}
