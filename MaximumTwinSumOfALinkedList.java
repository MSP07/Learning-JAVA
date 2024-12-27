/*approach
  linked list, two pointers
  to get the twin sum of the given linked list first we need to find
  the middle of the linked list and then the next half part after the middle
  node we reverse the part and so we get the pair by keeping pointers at head
  and the last node so we get the twin nodes and we keep track of the max sum
  of the nodes and finally return it*/
class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        while(curr!=null){
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        ListNode start = head;
        ListNode end = prev;
        int maxi = 0;
        while(end!=null){
            maxi = Math.max(maxi,start.val+end.val);
            start = start.next;
            end = end.next;
        }
        return maxi;
    }
}
