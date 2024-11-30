/*approach
  bfs
  we need to check whether the level has full nodes except the last level and we know
  first level has full nodes so we keep a boolean flag initially as false and while iterating
  if we come across a empty node we make that true and we check that whether there was node or not
  in the prev level using this flag since we always push the curr->left when we check whether there is
  node or not the left subtree will be checked first if there is no node there we mark false and keep moving
  by pushing left and right nodes of next level by this we can check the completeness of tree in every level
  except the last level*/
class Solution{
    public boolean isCompleteTree(TreeNode root){
        if(root!=null)return true;
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        boolean empty = false;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr!=null){
                if(empty)return false;
                q.add(curr.left);
                q.add(curr.right);
            }else{
                empty = true;
            }
        }
        return true;
    }
}
