package leetcode.binary_tree.preorder_traversal;

import java.util.ArrayList;
import java.util.List;
import leetcode.binary_tree.TreeNode;

/**
 * 144. Binary Tree Preorder Traversal
 * Submission: https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/1318337111/
 *
 * Description:
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 *
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [1,2,3]
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
    private final List<Integer> nodeList = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null) {
            nodeList.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return nodeList;
    }
}
