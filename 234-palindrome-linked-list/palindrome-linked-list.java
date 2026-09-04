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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode y=head;
        ListNode x=reverse(y);
        while(x!=null){
            if(x.val!=y.val){
                return false;
            }
            x=x.next;
            y=y.next;
        }
        return true;

    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode newNode=new ListNode(head.val);
            newNode.next=prev;
            prev=newNode;
            head=head.next;
        }
        return prev;
    }
}