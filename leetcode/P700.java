/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public TreeNode searchBST(TreeNode root, int val) {
      
      while (root != null) {
          if (val == root.val) {
              return root;
          } else {
              if (root.val > val) {
                  root = root.left;
              } else {
                  root = root.right;
              }
          }
      }
      return root;
  }
}