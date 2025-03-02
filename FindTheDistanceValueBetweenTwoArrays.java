/*approach
  two pointers
  we find the elements that have abs(arr1[i]-arr2[j])<=d and mark 
  the flag as false marking there is no points that satisfy given condition
  and if there are no points like that we increase the cnt and finally return that count*/
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0;
        for(int i=0;i<arr1.length;i++){
            boolean isValid = true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                cnt++;
            }
        }
        return cnt;
    }
}
