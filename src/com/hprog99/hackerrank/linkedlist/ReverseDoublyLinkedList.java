package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem?isFullScreen=false
public class ReverseDoublyLinkedList {
    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        DoublyLinkedListNode head = llist;
        if (head == null || head.next == null) {
            return head;
        }
        DoublyLinkedListNode temp = null;
        while (head != null) {
            temp = head.prev;
            head.prev = head.next;
            head.next = temp;
            head = head.prev;
        }
        if (temp != null) {
            temp = temp.prev;
        }
        return temp;
    }
}
