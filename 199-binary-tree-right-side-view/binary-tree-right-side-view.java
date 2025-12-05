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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
         ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        q.add(root);
       
        while(q.size()>0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode currentele=q.poll();
                if(i==size-1)
                {
                    res.add(currentele.val);
                }
                if(currentele.left !=null) q.add(currentele.left);
                if(currentele.right !=null) q.add(currentele.right);

            }
        }
        return res;
        
    }
}