/*approach
  binary tree, recursion
  given two preorder and postorder arrays 
  the root node will be same so we start with two pointers i and j
  we first take the preorder[i] and increase i and check whether the new root(root = preorder[i])
  is same as postorder if not we recursively take the preorder[i] as root->left and again check the same
  this time for root->eight and finally increase j pointer and return root*/
class Solution{
    private TreeNode construct(int[] i,int[] j,int[] preorder,int[] postorder){
        TreeNode root = new TreeNode(preorder[i[0]]);
        i[0]++;
        if(root.val!=postorder[j[0]]){
            root.left = construct(i,j,preorder,postorder);
        }
        if(root.val!=postorder[j[0]]){
            root.right = construct(i,j,preorder,postorder);
        }
        j[0]++;
        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder,int[] postorder){
        int[] i ={0}, j = {0};
        return construct(i,j,preorder,postorder);
    }
}
