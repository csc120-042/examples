package h_interfaces.ver2;

/*
 * LinkedListTest.java
 * Burton Rosenberg
 * April 2004
 * update: may 2020
 */

public class LinkedListTest extends ReadClass {

    public static void main(String [] args) {
        LinkedList ll = new LinkedList() ;
        String s ;

        System.out.println("enter strings; end with an empty line.") ;
        s = readString("> ") ;
        while (s!=null ) {
            ll.insertAtHead(s) ;
            s = readString("> ") ;
        }

        LinkedListStringNodePrinter llsnp = new LinkedListStringNodePrinter() ;
        ll.print( llsnp ) ;
    }
}

