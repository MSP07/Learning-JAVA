/*approach
  two pointers
  we check if both chars are equal or we incr the left pointer or decrease the left pointer
  by 1 and 25 respectively we get the char at str2  equivalently if so we incr the second pointer
  and at the end of the iteration if the second pointer is at the last index of the str2 then we can
  successfully make a subsequence else we cannot*/
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n=str1.length(),m=str2.length();
        if(n<m)return false;
        int j=0;
        for(int i=0;i<n&&j<m;i++){
            if(str1.charAt(i)==str2.charAt(j) || str1.charAt(i)+1==str2.charAt(j) || str1.charAt(i)-25 == str2.charAt(j)){
                j++;
            }
        }
        return j==m;
    }
}
