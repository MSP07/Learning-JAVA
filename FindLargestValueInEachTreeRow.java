/*approach
  bfs approach
  we initially check whether is there a root or not if not we return empty array
  we then traverse through each level of tree using queue and bfs and calculate max element
  and then finally push the maximum element to the answer and return the ans array*/
class Solution{
    public List<Integer> largestValues(TreeNode root){
        if(root==null)return new ArrayList<>();
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        ArrayList<Integer>ans = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            int maxi = Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                maxi = Math.max(maxi,curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            ans.add(maxi);
        }
        return ans;
    }
}
