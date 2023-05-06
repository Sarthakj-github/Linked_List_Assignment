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
        ListNode nprev=head,curr=head;
        while(n!=0){
            curr=curr.next;
            n--;
        }
        while(curr!=null && curr.next!=null){
            curr=curr.next;
            nprev=nprev.next;
        }
        if(curr==null && nprev==head){
            return head.next;
        }
        nprev.next=nprev.next.next;
        return head;
    }
}
