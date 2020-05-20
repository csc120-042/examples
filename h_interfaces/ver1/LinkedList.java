package h_interfaces.ver1;

/*
 * LinkedList
 * Burton Rosenberg
 * April 2004
 * update: May 2020
 */

public class LinkedList {

    LinkedListNode head;

    void insertAtHead(Object o) {
        head = new LinkedListNode(o, head);
    }

    void print() {
        LinkedListNode lln = head;
        while (lln != null) {
            System.out.println(lln.contents);
            lln = lln.next;
        }
    }
}

