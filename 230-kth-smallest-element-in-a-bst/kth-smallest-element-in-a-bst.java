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
    public int kthSmallest(TreeNode root, int k) {
        int sum=0;
       Stack<TreeNode>q=new Stack<>();
       ArrayList<Integer>res=new ArrayList<>();
       TreeNode currnode=root;
       while(currnode!=null ||!q.isEmpty())
       {
          while(currnode!=null)
          { 
            q.push(currnode);
            currnode=currnode.left;  
          }
          currnode=q.pop();
          res.add(currnode.val);
          currnode=currnode.right;

       }
       int d=res.get(k-1);
       return d;
    }
}