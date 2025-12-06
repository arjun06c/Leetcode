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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        long fin=0;
        long sum=0;
        ArrayList<Long>res=new ArrayList<>();

        while(q.size()>0)
        {
            int size=q.size();
            sum=0;
            while(size>0)
            {
                TreeNode currnode=q.poll();
                sum+=currnode.val;
                if(currnode.left!=null)q.add(currnode.left);
                if(currnode.right!=null)q.add(currnode.right);
                size--;

            }
            res.add(sum);

        }
        Collections.sort(res);
      if(res.size()>=k)
      {
        fin=res.get(res.size()-k);
      }
      else{
        return -1;
      }

        return fin;
    }
}