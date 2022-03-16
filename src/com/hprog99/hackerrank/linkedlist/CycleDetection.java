package com.hprog99.hackerrank.linkedlist;

// https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem
public class CycleDetection {
    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null)
            return false;
        SinglyLinkedListNode slowPointer = head;
        SinglyLinkedListNode fastPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }
}
