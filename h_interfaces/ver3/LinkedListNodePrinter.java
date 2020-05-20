package h_interfaces.ver3;

/*
 * LinkedListNodePrinter.java
 * Burton Rosenberg
 * April 2004
 */

// introduces a type. any object of this type can
// print a LinkedListNode. various implementations (classes
// implementing the interface) are specific to the
// type of object contained in the LinkedListNode.

public interface LinkedListNodePrinter {

    public void printNode(LinkedListNode lln);

}

