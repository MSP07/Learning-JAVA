/*approach
  linked list, string
  first we iterate and get all the nums in the linked list
  then finally we return that as integer to the power 2*/
class Solution{
    public int getDecimalValue(ListNode head){
        StringBuilder ans = new StringBuilder();
        while(head!=null){
            ans.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(ans.toString(),2);
    }
}
