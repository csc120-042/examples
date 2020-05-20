package h_interfaces.ver3;

/*
 * LinkedListStringNodeComparer.java
 * Burton Rosenberg
 * April 2004
 */

// Implementation of LinkedListNodeComparer when LinkedListNode
// stores String in its contents field.

class LinkedListStringNodeComparer implements LinkedListNodeComparer {
    String compare_string;

    LinkedListStringNodeComparer(String compare_string_local) {
        compare_string = compare_string_local;
    }

    public int compareNode(LinkedListNode lln) {
        String s = (String) lln.contents;
        System.out.println("LinkedListStringNodeComparer: "
                + compare_string + ".compareTo(" + s + ")=" + compare_string.compareTo(s));
        return compare_string.compareTo(s);
    }
}


