package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
public class InsertNodeAtSpecificPosition {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data,
            int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (llist == null) {
            return node;
        } else {
            SinglyLinkedListNode currentNode = llist;
            for (int i = 1; i < position; i++) {
                currentNode = currentNode.next;
            }
            node.next = currentNode.next;
            currentNode.next = node;
            return llist;
        }
    }
}
