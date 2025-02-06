/*approach
  string
  while we find the substring in the main string
  we keep on removing and finally return the modified string*/
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.length() > 0 && s.indexOf(part) != -1) {
            s = s.substring(0, s.indexOf(part)) + s.substring(s.indexOf(part) + part.length());
        }
        return s;
    }
}
