/*approach
  string, simulation, two pointers
  ans will be in the length of len(s) + len(spaces) so we reserve that first
  to optimize time then we iterate through s and spaces and if the index matches
  the spaces[j] then we add an empty space to the string and incr that pointer
  and we by default add the chars in s to that of our ans string and finally return the ans string*/
class Solution{
    public String addSpaces(String s,int[] spaces){
        StringBuilder ans = new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(j<spaces.length && i==spaces[j]){
                ans.append(" ");
                j++;
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}
