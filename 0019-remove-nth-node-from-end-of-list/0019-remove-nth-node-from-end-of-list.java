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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
     ListNode temp=head;
     while(temp != null){
        temp=temp.next;
        size++;
     }
     if(n==size){
        return head.next;
     }
     int remove=size-n;
     ListNode prev=head;
     int cp=1;
     while(cp != remove){
        prev=prev.next;
        cp++;
     }
      prev.next=prev.next.next;
      return head;
    }
}