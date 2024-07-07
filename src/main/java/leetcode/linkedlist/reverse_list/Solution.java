package leetcode.linkedlist.reverse_list;

/**
 * 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/submissions/1309707971
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 *
 * Input: head = [1,2]
 * Output: [2,1]
 *
 * Input: head = []
 * Output: []
 *
 * Constraints: *
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000 *
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
