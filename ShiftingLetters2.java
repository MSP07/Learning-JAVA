/*approach
  prefixsum,string
  if we use brute force and change all the chars from start to end for each shift
  in shifts it will be not optimal for large cases so instead we can pre compute
  the chars in the string and store it in the array and we will change the string s
  with help of that prefix array and finally return s or the ans string*/
class Solution{
    public String shiftingLetters(String s,int[][] shifts){
        int n = s.length();
        int[] diff = new int[n+1];
        for(int[] shift:shifts){
            int start = shift[0];
            int end = shift[1];
            int difference = shift[2];
            diff[start] += (2*difference-1);
            diff[end+1] -= (2*difference-1);
        }
        int cnt = 0;
        char[] chars = s.toCharArray();
        for(int i=0;i<n;i++){
            cnt = (cnt+diff[i])%26;
            chars[i] = (char)('a'+(chars[i]-'a'+cnt+26)%26);
        }
        return new String(chars);
    }
}
