package leetcode.linkedlist.merge_sorted_lists;

import leetcode.linkedlist.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode firstResult = solution.mergeTwoLists(ListNode.of(1, 2, 4), ListNode.of(1, 3, 4));
        // Output is [1,1,2,3,4,4]
        ListNode.printListNode(firstResult);

        ListNode secondResult = solution.mergeTwoLists(null, null);
        // Output is []
        ListNode.printListNode(secondResult);

        ListNode thirdResult = solution.mergeTwoLists(null, ListNode.of(0));
        // Output is [0]
        ListNode.printListNode(thirdResult);
    }
}
