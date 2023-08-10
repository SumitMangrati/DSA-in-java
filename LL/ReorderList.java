public class ReorderList {

    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


 /*
  1 2 3 4
  ans: 1 4 2 3 
  
  */
class Solution {
    public void reorderList(ListNode head) {
        ListNode headFisrt=head;
        ListNode mid=getMid(head);
        ListNode headSecond=reverseList(mid);
        while(headFisrt!=null && headSecond!=null){
            ListNode temp=headFisrt.next;
            headFisrt.next=headSecond;
            headFisrt=temp;
            temp=headSecond.next;
            headSecond.next=headFisrt;
            headSecond=temp;
        }
        if(headFisrt!=null){
            headFisrt.next=null;
        }
    }

    public ListNode getMid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
}
public ListNode reverseList(ListNode head){
        if(head==null){
            return  head;
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;
        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
}
}
}
