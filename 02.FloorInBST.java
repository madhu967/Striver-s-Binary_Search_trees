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
    public TreeNode searchBST(TreeNode root, int val) {
      int floor=-1;
        while(root!=null){
          if(root.val==val){
            floor=root.val;
            return floor;
          }
          else if(val>root.val){
            floor=root.val;
            root=root.right;
          }
          else{
            root=root.left;
          }
        }
      return root;
    }
}
