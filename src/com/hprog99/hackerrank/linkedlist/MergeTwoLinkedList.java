package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
public class MergeTwoLinkedList {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode result = new SinglyLinkedListNode(0);
        SinglyLinkedListNode tail = result;
        while (true) {
            if (head1 == null) {
                tail.next = head2;
                break;
            }
            if (head2 == null) {
                tail.next = head1;
                break;
            }

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        return result.next;
    }

    // recursive approach
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        if (head1.data <= head2.data) {
            head1.next = mergeLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeLists(head1, head2.next);
            return head2;
        }
    }
}
