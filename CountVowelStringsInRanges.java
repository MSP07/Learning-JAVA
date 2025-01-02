/*approach
  prefixsum, string
  we start by counting the no of strings that contain vowels from first word to ith word in words
  and then we use the prefix array and iterate again in queries array and calculate the no of vowel words
  from li to ri and append it to result vector/array and finally reutnr it*/
class Solution {
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n];
        int[] result = new int[queries.length];
        prefix[0] = (isVowel(words[0].charAt(0)) && isVowel(words[0].charAt(words[0].length() - 1))) ? 1 : 0;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1];
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                prefix[i]++;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefix[ri] - (li > 0 ? prefix[li - 1] : 0);
        }
        return result;
    }
}
