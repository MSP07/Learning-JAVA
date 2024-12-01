/*approach
  hashmap
  we iterate through the arr and keep track of elements in the arr 
  so if we see a num that is twice of any prev num of num/2 of a prev num
  we return true else after complete iteration we return false*/
class Solution{
    public boolean checkIfExist(int[] arr){
        HashSet<Integer>hashi = new HashSet<>();
        for(int num:arr){
            if(hashi.contains(num*2))return true;
            if(num%2==0 && hashi.contains(num/2))return true;
            hashi.add(num);
        }
        return false;
    }
}
