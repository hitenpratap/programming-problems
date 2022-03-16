package com.hprog99.hackerrank.linkedlist;

import java.util.Stack;

// https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
public class GetNodeValue {
    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
        Stack<Integer> stack = new Stack<Integer>();
        while (llist.next != null) {
            stack.push(llist.data);
            llist = llist.next;
        }
        for (int i = 0; i < positionFromTail; i++) {
            stack.pop();
        }
        return stack.pop();
    }

    public static int getNode2(SinglyLinkedListNode llist, int positionFromTail) {
        SinglyLinkedListNode runner = llist;
        SinglyLinkedListNode current = llist;
        for (int i = 0; i < positionFromTail; i++) {
            runner = runner.next;
        }
        while (runner.next != null) {
            runner = runner.next;
            current = current.next;
        }
        return current.data;
    }
}
