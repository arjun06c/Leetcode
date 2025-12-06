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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        if(root==null) return 0;
        int max=Integer.MIN_VALUE;
        int ans=0;
        int count=0;
        int sum;
        Boolean flag=true;
        while(q.size()>0)
        {  sum=0;
            int size=q.size();
            while(size>0)
            {
                TreeNode currnode=q.poll();
                sum=sum+(int)currnode.val;
                if(currnode.left!=null)q.add(currnode.left);
                if(currnode.right!=null)q.add(currnode.right);
                size--;
            }
            count++;
            if(max<sum)
            {
                max=sum;
                ans=count;
            }

        }
        return ans;
    }
}