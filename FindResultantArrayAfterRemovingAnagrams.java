/*approach
  string,sorting
  we check whether the curr and prev strings are anagrams
  by sorting them and checking whether they are equal if so
  we remove the curr element from the array and finally return the array*/
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        String prev = ""; 
        for(String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!sortedWord.equals(prev)){ 
                result.add(word);
                prev = sortedWord;
            }
        }
        return result;
    }
}
