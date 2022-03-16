package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem
public class InsertNodeAtLast {
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head == null) {
            head = node;
        } else {
            SinglyLinkedListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        return head;
    }
}
