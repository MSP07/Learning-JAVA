/*approach
  simulation
  we calculate digits for every number in a iterative modulo, divisor manner
  and add it to the ans vector and then finally return the ans vector*/
class Solution{
    private void calc(int num,ArrayList<Integer> temp){
        if(num<=0)return;
        calc(num/10,temp);
        temp.add(num%10);
    }
    public int[] seperateDigits(int[] nums){
        ArrayList<Integer>temp = new ArrayList<>();
        for(int num:nums){
            calc(num,temp);
        }
        int n = temp.size();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = temp.get(i);
        }
        return ans;
    }
}
