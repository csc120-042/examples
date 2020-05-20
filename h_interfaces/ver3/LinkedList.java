package h_interfaces.ver3;

/*
 * LinkedList.java
 * Burton Rosenberg
 * April 2004
 *
 * A linked list supporting print, insertAtHead and find
 */

public class LinkedList {

    LinkedListNode head ;

    void insertAtHead(Object o) {
        head = new LinkedListNode( o, head ) ;
    }

    LinkedListNode find(LinkedListNodeComparer llnc) {
        LinkedListNode lln = head ;
        while ( lln!=null ) {
            if ( llnc.compareNode(lln)==0 ) return lln ;
            lln = lln.next ;
        }
        return null ;
    }

    boolean delete( LinkedListNode lln ) {
        if ( head == null ) return false ;
        if ( lln == head ) {
            head = head.next ;
            return true ;
        }
        LinkedListNode bntd = head ; // bntd means before node to delete
        while ( bntd!=null ) {
            if ( bntd.next == lln ) {
                // found the node before lln, do surgery
                bntd.next = lln.next ;
                return true ;
            }
            bntd = bntd.next ;
        }
        return false ;
    }

    void print(LinkedListNodePrinter llnp) {
        LinkedListNode lln = head ;
        while ( lln!=null ) {
            llnp.printNode(lln) ;
            lln = lln.next ;
        }
    }
}

