/*approach
  string, simulation
  we keep a temp string start concenating strings in the words
  and when our temp has same size as s we return whether they are same or not
  if none of the concatination gives length same as s then we return false finally 
  this works because the given string s must form right from start of words and not from anywhere middle*/
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String temp = "";
        for(String word:words){
            temp += word;
            if(temp.length()==s.length()){
                return temp.equals(s);
            }
        }
        return false;
    }
}
