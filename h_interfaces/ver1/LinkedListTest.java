package h_interfaces.ver1;

/*
 * LinkedLIstTest.java
 * Burton Rosenberg
 * April 2004
 * update: May 2020
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

        ll.print();
    }
}


