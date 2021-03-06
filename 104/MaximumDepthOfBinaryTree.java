/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 * Time:  O(n)
 * Space: O(height)
 */
 
public class MaximumDepthOfBinaryTree {
    
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
    
}