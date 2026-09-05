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
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val==val){
            head=head.next;
        }
        ListNode start=head;
        while(start!=null&&start.next!=null){
            if(start.next.val==val){
                start.next=start.next.next;
            }
            else{
                start=start.next;
            }
        }
        return head;
    }
}