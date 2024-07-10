package leetcode.linkedlist.palindrom_linkedlist;

import leetcode.linkedlist.ListNode;

/**
 * 234. Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/submissions/1316403115/
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 *
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 *
 * Constraints:
 * The number of nodes in the list is in the range [1, 105].
 * 0 <= Node.val <= 9
 */
public class Solution {
    public static boolean isPalindrome(ListNode head) {
        ListNode iter = head;
        ListNode firstHalfReversed = null;
        //reverse first half of the ListNode and move pointer to middle of the head
        while (iter != null && iter.next != null) {
            firstHalfReversed = ListNode.of(head.val, firstHalfReversed);
            head = head.next;
            iter = iter.next.next;
        }
        //solve odd or even size ListNode
        if (iter != null) {
            head = head.next;
        }

        //Iterate forward over rest of the head and backward over inverted first half
        while (head != null) {
            if (head.val != firstHalfReversed.val) {
                return false;
            }
            head = head.next;
            firstHalfReversed = firstHalfReversed.next;
        }
        return true;
    }

    public static void main(String[] args) {
        //Output true
        System.out.println(isPalindrome(ListNode.of(1, 2, 2, 1)));

        //Output false
        System.out.println(isPalindrome(ListNode.of(1, 2)));

        //Output true
        System.out.println(isPalindrome(ListNode.of(1, 2, 1)));

        //Output true
        System.out.println(isPalindrome(ListNode.of(1, 2, 2, 2, 1)));
    }
}
