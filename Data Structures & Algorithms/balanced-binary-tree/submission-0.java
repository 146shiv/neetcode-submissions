class Solution {
    
    public int height(TreeNode root){
        if(root == null || (root.left == null && root.right==null)) return 0;

        return 1+ Math.max(height(root.left) , height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        int leftHeight = height(root.left);
        if(root.left!=null) leftHeight++;
        int rightHeight = height(root.right);
        if(root.right!=null) rightHeight++;

        int difference = leftHeight  - rightHeight;

        if(difference<0){
            difference = -difference;
        }
        if(difference>1){
            return false;
        }
        return (isBalanced(root.right) && isBalanced(root.left));


    }
}
