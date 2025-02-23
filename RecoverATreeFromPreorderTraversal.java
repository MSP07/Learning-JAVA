/*approach
  string, binary tree
  from the given string we extract the depth with the logic '-' is one depth
  and with that we calculate the depth and construct the tree*/
public class Solution {
    static int index = 0;
    private TreeNode helper(String traversal, int depth) {
        if (index >= traversal.length()) return null;
        int dashCount = 0;
        while((index+dashCount)<traversal.length()& traversal.charAt(index+dashCount) == '-'){
            dashCount++;
        }
        if(dashCount != depth) return null;
        index += dashCount;
        int value = 0;
        while(index < traversal.length() &&Character.isDigit(traversal.charAt(index))){
            value = value * 10 + (traversal.charAt(index++) - '0');
        }
        TreeNode node = new TreeNode(value);
        node.left = helper(traversal, depth + 1);
        node.right = helper(traversal, depth + 1);

        return node;
    }
    public TreeNode recoverFromPreorder(String traversal) {
        index = 0;
        return helper(traversal, 0);
    } 
}
