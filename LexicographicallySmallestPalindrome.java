/*approach
  two pointers, greedy, string, simulation
  we start of by iterating from start and from end 
  if both are equal we keep on iterating else we check which one is lexicographically smallest
  and we change the other one to that small one and finally return the string*/
class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i < j){
            if(arr[i] != arr[j]){
                if(arr[i] < arr[j]){
                    arr[j] = arr[i];
                }else{
                    arr[i] = arr[j];
                }
            }
            i++;j--;
        }
        return new String(arr);
    }
}
