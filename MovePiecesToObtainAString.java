/*approach
  two pointers, string
  if there are '_' we skip them and incr the pointers 
  if we reach the end then both are same so we return true
  else we check for conditions such as whether char can be shifted to left
  or right if 'L' and 'R' are there respectively and if both chars are same or not
  which will prevent the string from forming target and we return false after checking
  all these conditions if none of them raise red flags we return true*/
class Solution{
    public boolean canMake(String start,String target){
        int n = start.length();
        int i=0,j=0;
        while(i<n || j<n){
            if(i<n && start.charAt(i)=='_')i++;
            if(j<n && target.charAt(j)=='_')j++;
            if(i==n && j==n)return true;
            if(i==n || j==n)return false;
            if(start.charAt(i)!=target.charAt(j))return false;
            if(start.charAt(i)=='L' && i<j)return false;
            if(target.charAt(j)=='R' && i>j)return false;
        }
        return true;
    }
}
