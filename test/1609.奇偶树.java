package test;

import java.util.ArrayDeque;
import java.util.Queue;

import struct.TreeNode;

/*
 * @lc app=leetcode.cn id=1609 lang=java
 * @lcpr version=30204
 *
 * [1609] 奇偶树
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int prev = level % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int value = node.val;
                if (level % 2 == value % 2) {
                    return false;
                }
                if ((level % 2 == 0 && value <= prev) || (level % 2 == 1 && value >= prev)) {
                    return false;
                }
                prev = value;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            level++;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,10,4,3,null,7,9,12,8,6,null,null,2]\n
// @lcpr case=end

// @lcpr case=start
// [5,4,2,3,3,7]\n
// @lcpr case=end

// @lcpr case=start
// [5,9,1,3,5,7]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [11,8,6,1,3,9,11,30,20,18,16,12,10,4,2,17]\n
// @lcpr case=end

 */

