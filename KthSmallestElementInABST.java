/*approach
  inorder traversal of BST is always sorted
  so we use that keep decr k and if we find the kth smallest before k becomes 0
  we return it else we return when k becomes 0 if k != 0 then we proceed to calculate
  right side of the tree*/
class Solution {
    private int inorder(TreeNode root,int k,int[] cnt){
        if(root==null)return 0;
        int left = inorder(root.left,k,cnt);
        if(left!=0)return left;
        cnt[0]++;
        if(cnt[0]==k)return root.val;
        return inorder(root.right,k,cnt);
    }
    public int kthSmallest(TreeNode root, int k) {
        int[] cnt = {0};
        return inorder(root,k,cnt);
    }
}
