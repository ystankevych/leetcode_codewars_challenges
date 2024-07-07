package leetcode.linkedlist.reverse_list;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    int val;
    ListNode next;

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
}
