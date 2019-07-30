/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
 */



class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0 ;
        }
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode t2 = new TreeNode(20);
        root.right = t2;
        t2.left=new TreeNode(7);
        t2.right=new TreeNode(15);

        s.maxDepth(root);
    }
}
