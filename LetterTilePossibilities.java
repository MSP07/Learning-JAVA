/*approach
  hashmap,counting,string,backtracking
  given problem tends us to find all the possible combination count
  we can achieve this by first calculating the count of all chars in the given string
  storing them in a hashmap and we iterate through that hashmap and if a char has count 
  then we temporarily reduce the count and calculate the total possibilities again and then 
  change the count back to normal and finally return the manipulated count*/
class Solution {
    private void find(int[] freq,int[] cnt){
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                cnt[0]++;
                freq[i]--;
                find(freq,cnt);
                freq[i]++;
            }
        }
    }
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        int[] cnt = {0};
        for(char c:tiles.toCharArray()){
            freq[c-'A']++;
        }
        find(freq,cnt);
        return cnt[0];
    }
}
