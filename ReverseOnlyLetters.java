/*approach
  string, two pointers
  aim is to swap only letters so we keep two pointers
  one at start and another at end and if both are letters we swap and change pointers
  else we keep the pointer where the char is letter and change the other pointer accordingly
  and finally return the modified string*/
class Solution {
    private void swap(int l,int r,char[] arr){
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray(); 
        int l = 0, r = arr.length - 1;
        while(l<r){
            if(Character.isLetter(s.charAt(l)) && Character.isLetter(s.charAt(r))){
                swap(l,r,arr);
                l++;
                r--;
            }else if(Character.isLetter(s.charAt(l))){
                r--;
            }else{
                l++;
            }
        }
        return new String(arr);
    }
}
