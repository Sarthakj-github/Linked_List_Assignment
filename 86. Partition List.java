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
    public ListNode partition(ListNode head, int x) {
        ListNode l=null,g=null,cur=head;
        ListNode p1 = new ListNode(-1),p2 = new ListNode(-1);
        while(cur!=null){
            System.out.println(cur.val);
            if(cur.val<x){
                if(l==null) l=cur;
                p1.next=cur;    p1=cur;
            }
            else{
                if(g==null) g=cur;
                p2.next=cur;    p2=cur;
            }
            cur=cur.next;
        }
        if(l==null) return g;
        p2.next=null;   p1.next=g;
        return l;
    }
}
