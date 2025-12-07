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
        Queue<TreeNode>q=new LinkedList<>();
        ArrayList<Integer>res=new ArrayList<>();
        q.add(root);
        int sum=0;
        while(q.size()>0)
        {
            int size=q.size();
            
            TreeNode currnode=q.poll();
            res.add(currnode.val);
            if(currnode.left!=null)q.add(currnode.left);
            if(currnode.right!=null)q.add(currnode.right);
           
        }
        // for(int i=0;i<res.size();i++)
        // {
        //     System.out.println(res.get(i));
        // }
        
        Collections.sort(res);
        int d=res.get(k-1);
        return d;
    }
}