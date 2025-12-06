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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>res=new ArrayList<>();
        if(root==null) return res;
        q.add(root);
        while(!q.isEmpty())
        {
             int size=q.size();
             ArrayList<Integer>level=new ArrayList<>();
             while(size>0)
             {
                TreeNode currnode=q.poll();
                level.add(currnode.val);
                if(currnode.left!=null)q.add(currnode.left);
                if(currnode.right!=null)q.add(currnode.right);
                size--;
             }
             res.add(level);
        }
        Collections.reverse(res);
        return res;
    }
}