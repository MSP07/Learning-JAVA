/*approach
  greedy,sorting
  we start by sorting the array capacity
  then to fill min boxes we need to max no of apples in highest capacity boxes
  so we iterate from last and reduce the total apples count by the capacity of boxes
  and incr the req boxes if at any point sum/total becomes <= 0 then we have successfully
  distributed apples into the boxes so we break and finally return the count of boxes*/
class Solution{
    public int minimumBoxes(int[] apple,int[] capacity){
        Arrays.sort(capacity);
        int sum = 0;
        for(int num:apples){
            sum += num;
        }
        int boxes = 0;
        for(int i=capacity.length-1;i>=0;i--){
            if(sum<=0)break;
            sum -= capacity[i];
            ++boxes;
        }
        return boxes;
    }
};
