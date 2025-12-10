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


    public ListNode fun(ListNode root,int k)
    {
        ListNode tptr=root;
        int count=1;
        while(tptr!=null)
        {
            if(count==k)
            {
                return tptr;
            }
            count++;
            tptr=tptr.next;
        }
       return tptr;
    }


    public ListNode rotateRight(ListNode head, int k) {
         if(head==null || k==0)return head;                                         
        ListNode temp=head;
        int len=1;
        while(temp.next!=null)
        {
           temp=temp.next;
                      len++;

        }
        if(k%len==0) return head;
        k=k%len;
        temp.next=head;
        ListNode newnode=fun(head,len-k);
        head=newnode.next;
        newnode.next=null;
        return head;
        
    }
}