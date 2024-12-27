/*approach
we can simply remember the value
and calculate the max one and finally return it*/
class Solution{
    public int maxScoreSightseeingPair(int[] values){
        int a = values[0];
        int maxi = 0;
        for(int i=1;i<values.length;i++){
            a--;
            maxi = Math.max(maxi,a+values[i]);
            a = Math.max(a,values[i]);
        }
        return maxi;
    }
}
