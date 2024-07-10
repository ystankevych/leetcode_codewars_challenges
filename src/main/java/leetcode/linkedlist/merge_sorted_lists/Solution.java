package leetcode.linkedlist.merge_sorted_lists;

import leetcode.linkedlist.ListNode;

/**
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/submissions/1314909892/
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 * Example 1:
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 *
 * Example 3:
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = ListNode.of(0);
        ListNode iter = head;
        while (list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                iter.next = list1;
                list1 = list1.next;
            } else {
                iter.next = list2;
                list2 = list2.next;
            }
            iter = iter.next;
        }
        iter.next = (list1 == null) ? list2 : list1;
        return head.next;
    }
}
