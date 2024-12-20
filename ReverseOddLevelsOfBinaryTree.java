/*approach
  dfs approach
  we start from first level and change the nodes in the odd
  level using dfs recursively and when we encounter an empty
  level we return, finally after this process we return the root*/
class Solution{
    private void dfs(TreeNode left,TreeNode right,int depth){
        if(left==null && right==null)return;
        if(depth%2==0){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        dfs(left.left,right.right,depth+1);
        dfs(left.right,right.left,depth+1);
    }
    public TreeNode reverseOddLevels(TreeNode root){
        dfs(root.left,root.right,0);
        return root;
    }
}
