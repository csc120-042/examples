package h_interfaces.ver2;

/*
 * LinkedList.java
 * Burton Rosenberg
 * April 2004
 */

public class LinkedList {

    LinkedListNode head;

    void insertAtHead(Object o) {
        head = new LinkedListNode(o, head);
    }

    void print(LinkedListNodePrinter llnp) {
        LinkedListNode lln = head;
        while (lln != null) {
            llnp.printNode(lln);
            lln = lln.next;
        }
    }
}

