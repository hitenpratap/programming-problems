package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
public class CompareTwoLinkedList {
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        while (head1.next != null) {
            if (head1.data != head2.data)
                return false;
            head1 = head1.next;
            if (head2.next == null)
                return false;
            head2 = head2.next;
        }
        return true;
    }
}
