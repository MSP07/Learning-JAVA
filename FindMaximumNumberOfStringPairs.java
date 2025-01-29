/*approach
  hashmap, simulation
  to find no of pairs such that one is exact reverse of another
  we iterate through the strings and if any of the words reversed is
  already in that hashmap we increase the pairs else we add the org word
  to the hashmap and finally return the no of pairs*/
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String>hashi = new HashSet<>();
        int pairs = 0;
        for(String word : words){
            String temp = new StringBuilder(word).reverse().toString();
            if(hashi.contains(temp)){
                ++pairs;
            }else{
                hashi.add(word);
            }
        }
        return pairs;
    }
}
