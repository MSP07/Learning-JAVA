/*approach
  simulation, sorting, hashmap
  we can either use hashmap to store values and lookup each time we change original
  value or we can sort and change original val as lets say org is the highest val in the array
  then there will be no val higher than that to traverse similarly we get some mid values as original
  even after 2*original the val will be high and definitely lie after the current value, this
  approach saves space*/
class Solution{
    public int findFinalValue(int[] nums,int original){
        Arrays.sort(nums);
        for(int num:nums){
            if(num==original){
                original *= 2;
            }
        }
        return original;
    }
}
