/*approach
  two pointers
  to solve this efficiently we keep one pointer at each array
  then we iterate and check for equal elements to return
  else if the nums1[i] < nums2[j] since arrays are sorted in ascending order
  there will be no nums1[i] in nums2 after jth index so we increase the i and
  search for other equal elements even if not that then we increase j and finally
  if no equal elements we return -1*/
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        return -1;
    }
}
