public class Main {


     // Definition for a binary tree node.
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
     }
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {

            return dfs(p, q);
        }
        public boolean dfs(TreeNode p, TreeNode q){
            if(p == null && q == null){
                return true;
            } else if((p != null && q != null) && p.val != q.val){
                return false;
            } else if(p != null && q == null){
                return false;
            } else if(p == null && q != null){
                return false;
            } else {

                return dfs(p.left, q.left) && dfs(p.right, q.right);
            }
        }
    }
    }
}