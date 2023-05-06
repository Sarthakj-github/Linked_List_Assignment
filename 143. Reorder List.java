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
    public void reorderList(ListNode head) {
        Stack<ListNode> S = new Stack<>();
        ListNode cur=head;
        while(cur!=null){
            S.push(cur);
            cur=cur.next;
        }
        ListNode p1=head,temp;
        boolean c=true;
        while(p1!=S.peek()){
            if(c){
                temp=p1.next;
                p1.next=S.peek();
                p1=temp;
            }
            else
                S.pop().next=p1;
            c=!c;
        }
        p1.next=null;
    }
}
