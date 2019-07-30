/*
 * @lc app=leetcode.cn id=101 lang=scala
 *
 * [101] 对称二叉树
 */
/**
 * Definition for a binary tree node.
 * class TreeNode(var _value: Int) {
 *   var value: Int = _value
 *   var left: TreeNode = null
 *   var right: TreeNode = null
 * }
 */
object Solution {
    def isSymmetric(root: TreeNode): Boolean = {
       if(root==null){
           return true
       } 
       helper(root.right,root.left)
    }
    def helper(left:TreeNode,right:TreeNode):Boolean = {
        if(left==null||right==null){
            return left==right
        }
        if(left.value!=right.value){
            return false
        }
        return helper(left.right,right.left)&&helper(left.left,right.right)
    }
}

