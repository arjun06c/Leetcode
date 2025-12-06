/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        Queue<TreeNode>q=new LinkedList<>();
         Queue<TreeNode>p=new LinkedList<>();
         q.add(root1);
         p.add(root2);
       
         while(p.size()>0 && q.size()>0)
         {
             TreeNode currnode1=q.poll();
            TreeNode currnode2=p.poll();
            if(currnode1==null && currnode2!=null) return false;
            if(currnode1!=null && currnode2==null) return false;
            
            
            if(currnode1!=null &&currnode2!=null)
            {
                if(currnode1.val!=currnode2.val) return false;
                q.add(currnode1.left);
                q.add(currnode1.right);
                p.add(currnode2.left);
                p.add(currnode2.right);

         }
         }
     return q.isEmpty()&& p.isEmpty();
        
    }
}