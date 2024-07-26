package leetcode.binary_tree.postorder_traversal;

import java.util.ArrayList;
import java.util.List;
import leetcode.binary_tree.TreeNode;

/**
 * 145. Binary Tree Postorder Traversal
 * Submission: https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/1322150549/
 *
 * Description:
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 *
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [3,2,1]
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
 * The number of the nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 */
public class Solution {
    private final List<Integer> intsList = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            intsList.add(root.val);
        }
        return intsList;     
    }
}