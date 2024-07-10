package leetcode.linkedlist;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    public int val;
    public ListNode next;

    private ListNode() {
    }

    private ListNode(int val) {
        this.val = val;
    }

    private ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode of(int...val) {
        ListNode head = new ListNode(val[0]);
        ListNode toReturn = head;
        for (int i = 1; i < val.length; i++) {
            head.next = new ListNode(val[i]);
            head = head.next;
        }
        return toReturn;
    }

    public static ListNode of(int value, ListNode next) {
        return new ListNode(value, next);
    }

    public static void printListNode(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }
}
