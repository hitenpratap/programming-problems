package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
public class DeleteDuplicateAsc {
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode head = llist;
        if (head == null || head.next == null)
            return head;
        while (head.next != null) {
            if (head.data != head.next.data) {
                head = head.next;
            } else {
                head.next = head.next.next;
            }
        }
        return current;
    }
}
