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

        ListNode  temp=head;
        ListNode slow=head;
        int count=0;
        if(head==null)
        {
            return null;
        } 
        
        while(temp!=null)
        {
            count+=1;
            temp=temp.next;
        }
        if(count==n)
        {
            return head.next;
        }
        int res=count-n;
        ListNode temp1=head;
        while(temp1!=null)
        {
           res--;
           if(res==0)
           {
            break;
           }
           temp1=temp1.next; 
        }
        temp1.next=temp1.next.next;
        return head;
    }
}