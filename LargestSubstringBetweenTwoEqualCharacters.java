/*approach
  hashmap
  we keep a hashmap to find the firstoccurence and 
  if the char is occured already then we calculate the length in between
  its chars and keep track of max ones*/
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] hashi = new int[26];
        Arrays.fill(hashi,-1);
        int maxi = -1;
        for(int i=0;i<s.length();i++){
            int ind = s.charAt(i)-'a';
            if(hashi[ind]==-1){
                hashi[ind] = i;
            }else{
                maxi = Math.max(maxi,i-hashi[ind]-1);
            }
        }
        return maxi;
    }
}
