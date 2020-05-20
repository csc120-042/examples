package h_interfaces.ver1;

/*
 * LinkedListNode
 * Burton Rosenberg
 * April 2004
 */

public class LinkedListNode {

    Object contents;
    LinkedListNode next;

    LinkedListNode(Object c, LinkedListNode n) {
        contents = c;
        next = n;
    }
}

