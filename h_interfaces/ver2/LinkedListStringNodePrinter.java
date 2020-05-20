package h_interfaces.ver2;

/*
 * LinkedListStringNodePrinter.java
 * Burton Rosenberg
 * April 2004
 */

// Implementation of a node printer, where the LinkedListNode
// contents is a String.

public class LinkedListStringNodePrinter implements LinkedListNodePrinter {

    public void printNode(LinkedListNode lln) {
        String s = (String) lln.contents;
        System.out.println("|" + s + "|");
    }
}

