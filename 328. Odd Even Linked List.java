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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return head;
        ListNode ptr1=head,ptr2=head.next,last=head.next;
        while(ptr1!=null && ptr2!=null){
            if(ptr2.next==null)
                break;
            ptr1.next=ptr2.next;
            ptr1=ptr1.next;
            ptr2.next=ptr1.next;
            ptr2=ptr2.next;
        }
        ptr1.next=last;
        return head;
    }
}
