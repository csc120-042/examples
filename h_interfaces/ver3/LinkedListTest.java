package h_interfaces.ver3;

/*
 * LinkedListTest.java
 * Burton Rosenberg
 * April 2004
 * update: may 2020
 */

public class LinkedListTest extends ReadClass {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        String s;

        System.out.println("enter strings; end with an empty line.") ;
        s = readString("> ");
        while (s != null) {
            ll.insertAtHead(s);
            s = readString("> ");
        }

        ll.print(new LinkedListStringNodePrinter());

        System.out.println("String to search for (empty line to end): ");
        s = readString(null);
        while (s != null) {
            LinkedListStringNodeComparer llsnc = new LinkedListStringNodeComparer(s);
            LinkedListNode lln = ll.find(llsnc);
            if (lln == null) System.out.println("NOT FOUND");
            else {
                System.out.println("FOUND, will delete");
                ll.delete(lln);
                ll.print(new LinkedListStringNodePrinter());
            }
            s = readString("another string: ");
        }
    }
}

