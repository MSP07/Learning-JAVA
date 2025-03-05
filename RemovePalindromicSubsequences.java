/*approach
  two pointers
  if the string is palindrome then 1 else there is always a 
  a way to represent the given string as a palindorme + normal stirng
  so its either 1 is given string is palindrome else 2*/
class Solution {
    private boolean isPalindrome(String s){
        int left = 0, right = s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int removePalindromeSub(String s) {
        if(isPalindrome(s))return 1;
        else return 2;
    }
}
