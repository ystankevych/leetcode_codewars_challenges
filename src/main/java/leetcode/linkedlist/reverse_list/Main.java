package leetcode.linkedlist.reverse_list;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode first = ListNode.of(1, 2, 3, 4, 5);
        ListNode second = ListNode.of(1, 2);
        ListNode third = null;

        printListNode(solution.reverseList(first));
        printListNode(solution.reverseList(second));
        printListNode(solution.reverseList(third));
    }

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }
}