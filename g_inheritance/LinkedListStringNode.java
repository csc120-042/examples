package g_inheritance;

/*
 * class LinkedListStringNode
 * burton rosenberg
 * march 2004
 *
 * is-a LinkedListNode with a stringData field
 */

public class LinkedListStringNode extends LinkedListNode  {

    String stringData ;

    // override LinkListNode version of printNode to print stringData
    void printNode() {
        System.out.println("stringData= "+stringData) ;
    }

}
