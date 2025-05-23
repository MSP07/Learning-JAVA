/*approach
  array,hashmap
  we find sum of digits of given num and increase the count of 
  that num in our hashmap and finally return the max element in the hashmap*/
class Solution {
    private int find(int num){
        int temp = 0;
        while(num>0){
            temp += num%10;
            num /= 10;
        }
        return temp;
    }
    public int countBalls(int lowLimit, int highLimit) {
        int[] hashi = new int[46];
        for(int i=lowLimit;i<=highLimit;i++){
            hashi[find(i)]++;
        }
        int maxi = 0;
        for(int num:hashi){
            maxi = Math.max(maxi,num);
        }
        return maxi;
    }
}
