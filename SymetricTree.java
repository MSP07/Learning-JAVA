/*approach
  dfs
  we follow simple recursion starting from root->left and root->right
  if both nodes are equal and their {left->left,right->right} and {left->right,right->left}
  are same we return true else in any node if both nodes are not equal or we have
  only one node and not the other we return false*/
public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){this.val=val;}
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution{
    public boolean SymmetricCheck(TreeNode left,TreeNode right){
        if(left==null && right==null)return true;
        if(left==null || right==null)return false;
        return left.val==right.val && SymmetricCheck(left.left, right.right) && SymmetricCheck(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root){
        if(root.left==null && root.right==null)return true;
        return SymmetricCheck(root.left,root.right);
    }
};
