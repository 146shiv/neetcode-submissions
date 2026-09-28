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

    public boolean contains(TreeNode root, TreeNode node) {
        if (root == null) return false;

        if (root == node) return true;

        return contains(root.left, node)
            || contains(root.right, node);
    }

    public TreeNode lowestCommonAncestor(
            TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;

        if (root == p || root == q) return root;

        boolean leftp = contains(root.left, p);
        boolean leftq = contains(root.left, q);

        boolean rightp = contains(root.right, p);
        boolean rightq = contains(root.right, q);

        if ((leftp && rightq) || (rightp && leftq)) {
            return root;
        }

        if (leftp && leftq) {
            return lowestCommonAncestor(root.left, p, q);
        }

        if (rightp && rightq) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return null;
    }
}