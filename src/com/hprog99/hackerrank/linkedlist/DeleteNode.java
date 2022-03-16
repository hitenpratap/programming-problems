package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem
public class DeleteNode {
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        if (llist.next == null) {
            return null;
        } else if (position == 0) {
            return llist.next;
        } else {
            SinglyLinkedListNode currentNode = llist;
            for (int i = 1; i < position; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            return llist;
        }
    }
}
