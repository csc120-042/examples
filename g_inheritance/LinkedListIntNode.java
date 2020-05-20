package g_inheritance;

/*
 * class LinkedListIntNode
 * burton rosenberg
 * march 2004
 *
 * is-a LinkedListNode with an intData field
 */

public class LinkedListIntNode extends LinkedListNode  {

    int intData ;

    // override the LinkedList Node method printNode  to print intData
    void printNode() {
        System.out.println("intData= "+intData) ;
    }

}
