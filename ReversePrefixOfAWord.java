/*approach
  two pointer
  one pointer at 0 and another we will place it when we find
  ch in word and we reverse that part alone and return the string*/
class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0,j=-1;
        for(int k=0;k<word.length();k++){
            if(word.charAt(k)==ch){
                j = k;
                break;
            }
        }
        if(j==-1)return word;
        char[] temp = word.toCharArray();
        while(i<j){
            char s = temp[i];
            temp[i] = temp[j];
            temp[j] = s;
            i++;
            j--;
        }
        return new String(temp);
    }
}
