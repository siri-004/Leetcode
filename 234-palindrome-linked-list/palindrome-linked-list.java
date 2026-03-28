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
        ListNode s=head,f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode x=reverse(s);
        ListNode y=head;
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
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
}