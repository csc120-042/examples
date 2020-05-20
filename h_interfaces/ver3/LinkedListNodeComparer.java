package h_interfaces.ver3;

/*
 * LinkedListNodeComparer.java
 * Burton Rosenberg
 * April 2004
 *
 */

// Any object of this type can compare the contents of a
// LinkedListNode. Implementation classes depend upon the
// type of the contents.

// Constructor takes the item to compare.

public interface LinkedListNodeComparer {

    public int compareNode(LinkedListNode lln) ;

}

