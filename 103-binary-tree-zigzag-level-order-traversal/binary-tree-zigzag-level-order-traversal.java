
import java.util.*;
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return res;
        q.add(root);
        Boolean flag=true;
        while(q.size()>0)
        {
            int size=q.size();
            ArrayList<Integer>level=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode currnode=q.poll();
                level.add(currnode.val);
                if(currnode.left!=null)q.add(currnode.left);
                if(currnode.right!=null)q.add(currnode.right);

            }
            if(!flag)
            {
                Collections.reverse(level);
            }
            res.add(level);
            flag=!flag;
        }
        return res;
        
    }
}