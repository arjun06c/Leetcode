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
    ListNode fast=root.next;
    ListNode slow=root;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;

   }
   public ListNode merge(ListNode t1,ListNode t2)
   {

        
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(t1!=null && t2!=null)
        {
            if(t1.val<t2.val)
            {
                temp.next=t1;
                temp=t1;
                t1=t1.next;
            }
            else 
            {
                temp.next=t2;
                temp=t2;
                t2=t2.next;
            }
        }
        if(t1!=null)
        {
            temp.next=t1;
        }
        if(t2!=null)
        {
            temp.next=t2;
        }

    return dummy.next;
   }



    public ListNode sortList(ListNode head) {
      if(head==null|| head.next==null) return head;
     ListNode middle=fun(head);
     ListNode right=middle.next;
      middle.next=null;
     ListNode left=head;
     left=sortList(left);
     right=sortList(right);
       return merge(left,right);


        
    }
}