package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/reverse-a-linked-list/problem
public class ReverseLinkedList {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode next = current.next;
        SinglyLinkedListNode prev = null;
        while (next != null) {
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        current.next = prev;
        return current;
    }

    //Another approach
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        SinglyLinkedListNode current = llist;
        SinglyLinkedListNode next = current.next;
        current.next = null;
        while (next != null) {
            SinglyLinkedListNode temp = next;
            next = next.next;
            temp.next = current;
            current = temp;
        }
        return current;
    }
}
