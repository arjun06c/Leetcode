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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        int max=Integer.MIN_VALUE;
        q.add(root);
         List<Integer>res=new ArrayList<>();
         if(root==null) return res;

        while(q.size()>0)
        {
            int size=q.size();
            while(size>0)
            {
                TreeNode currnode=q.poll();
                
                    if(max<currnode.val)
                    {
                        max=currnode.val;
                    } 
                    size--;
                    if(currnode.left!=null)q.add(currnode.left);
                     if(currnode.right!=null)q.add(currnode.right);
            }
            res.add(max);
            max=Integer.MIN_VALUE;
        }
    return res;
        
    }
}