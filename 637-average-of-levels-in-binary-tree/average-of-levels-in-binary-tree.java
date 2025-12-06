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
    public List<Double> averageOfLevels(TreeNode root) {
         Queue<TreeNode>q=new LinkedList<>();
        List<Double>res=new ArrayList<>();
        if(root==null) return res;
        q.add(root);
        Double sum;
        Double copy=0.0;
        while(!q.isEmpty())
        {
            sum=0.0;
             double size=q.size();
             copy=size;
             while(size>0)
             {
                TreeNode currnode=q.poll();
                sum+=currnode.val;
                if(currnode.left!=null)q.add(currnode.left);
                if(currnode.right!=null)q.add(currnode.right);
                size--;
             }
             res.add(sum/copy);
        }
        return res;
        
    }
}