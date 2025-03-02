/*approach
  string, two pointers
  check every word for palindrome and return the first palindrome
  else finally return empty string*/
class Solution {
    private boolean isPalindrome(String word){
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-i-1))return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(isPalindrome(word))return word;
        }
        return "";
    }
}
