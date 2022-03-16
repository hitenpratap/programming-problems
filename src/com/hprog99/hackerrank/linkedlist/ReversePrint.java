package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem
public class ReversePrint {
    public static void reversePrint(SinglyLinkedListNode llist) {
        if(llist == null) return;
        reversePrint(llist.next);
        System.out.println(llist.data);
    }
}
