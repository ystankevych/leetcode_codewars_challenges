package leetcode.linkedlist.reverse_list;

import leetcode.linkedlist.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode first = ListNode.of(1, 2, 3, 4, 5);
        ListNode second = ListNode.of(1, 2);
        ListNode third = null;

        ListNode.printListNode(solution.reverseList(first));
        ListNode.printListNode(solution.reverseList(second));
        ListNode.printListNode(solution.reverseList(third));
    }
}