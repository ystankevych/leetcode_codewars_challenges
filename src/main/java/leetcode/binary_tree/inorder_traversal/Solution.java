package leetcode.binary_tree.inorder_traversal;

import leetcode.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. Binary Tree Inorder Traversal
 * Task submission:
 * https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/1316938450/
 *
 * Description:
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 *
 * Example 2:
 * Input: root = []
 * Output: []
 *
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 *
 * Constraints:
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        addToList(result, root);
        return result;
    }

    private void addToList(List<Integer> list, TreeNode root) {
        if (root != null) {
            addToList(list, root.left);
            list.add(root.val);
            addToList(list, root.right);
        }
    }
}
