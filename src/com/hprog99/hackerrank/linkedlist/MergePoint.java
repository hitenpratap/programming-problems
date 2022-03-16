package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem
public class MergePoint {
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode nodeA = head1;
        SinglyLinkedListNode nodeB = head2;
        while (nodeA != nodeB) {
            nodeA = nodeA == null ? head2 : nodeA.next;
            nodeB = nodeB == null ? head1 : nodeB.next;
        }
        return nodeA.data;
    }
}
