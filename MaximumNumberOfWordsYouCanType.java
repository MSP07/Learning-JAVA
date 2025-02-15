/*approach
  string, hashmap
  we use stringstream and hashset to store brokenletters
  if we find that broken letters in any words we count that
  word and finally return it*/
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> broken = new HashSet<>();
        for (char c : brokenLetters.toCharArray()) {
            broken.add(c); 
        }
        String[] words = text.split(" "); 
        int count = 0;
        for(String word : words){  
            boolean canType = true;
            for(char c : word.toCharArray()){
                if(broken.contains(c)){
                    canType = false;
                    break;
                }
            }
            if (canType) count++;
        }
        return count;
    }
}
