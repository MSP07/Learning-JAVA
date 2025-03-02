/*approach
  two pointers
  one pointer at each string and if name[i] == typed[j] then we move both pointers
  else if typed[j] == typed[j-1] then it is long pressed so we move j pointer alone
  else we return false as the chars are diff if above two are not the cases and finally
  if pointer at name if it has reached name.size() then typed is long pressed version of name
  and we return true else false*/
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while(j < typed.length()){
            if(i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)){
                j++;
            }else{
                return false;
            }
        }
        return i == name.length();
    }
}
