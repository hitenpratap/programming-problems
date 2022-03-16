package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem
public class InsertNodeAtHead {

    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (llist != null) {
            node.next = llist;
        }
        return node;
    }

}
