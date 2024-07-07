package leetcode.linkedlist.reverse_list;

/**
 * 206. Reverse Linked List
 * <a href="https://leetcode.com/problems/reverse-linked-list/submissions/1309707971"/a>
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * <p>
 * Input: head = [1,2]
 * Output: [2,1]
 * <p>
 * Input: head = []
 * Output: []
 * <p>
 * Constraints: *
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000 *
 * <p>
 * Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        while (head != null) {
            ListNode nextElement = head.next;
            head.next = previous;
            previous = head;
            head = nextElement;
        }
        return previous;
    }
}
