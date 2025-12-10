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

    public ListNode fun(ListNode root)
    {
        ListNode curr=root;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
   

    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null || head.next==null) return true;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newnode=fun(slow.next);
        ListNode first=head;
        ListNode second=newnode;

        while(second!=null)
        {
            if(first.val!=second.val)
            {
                fun(newnode);
                return false;
            }
            first=first.next;
            second=second.next;
        }
    fun(newnode);

        return true;
    }
}