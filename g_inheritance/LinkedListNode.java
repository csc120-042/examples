package g_inheritance;

/*
 * LinkedListNode
 * burton rosenberg
 * march 2004
 *
 * a node in a linked list, common functionality to inherit
 */

public class LinkedListNode {

    LinkedListNode next;

    LinkedListNode add(LinkedListNode lln) {
        next = lln;
        return this;
    }

    void print() {
        LinkedListNode lln = this;
        while (lln != null) {
            lln.printNode();
            lln = lln.next;
        }
    }

    void printNode() {
        System.out.println("Over-ride me: I print myself");
    }

    int length() {
        // using recursion
        if (next == null) return 1;
        return 1 + next.length();
    }

}


