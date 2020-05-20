package g_inheritance;

/*
 * LinkedListBothTest
 * burton rosenberg
 * march 2004
 *
 * tests LinkedListStringNode and LinkedListIntNode
 */


public class LinkedListBothTest extends ReadIntegerAndStrings {

    public static void main(String[] args) {

        LinkedListNode headOfList;
        headOfList = null;

        LinkedListIntNode newNode;

        System.out.println("Input integers to put in the linked list.");
        System.out.println("To finish input, use 0.");
        int j = readInteger("? ");
        while (j != 0) {
            newNode = new LinkedListIntNode();
            newNode.intData = j;
            headOfList = newNode.add(headOfList);
            j = readInteger("? ");
        }

        if (headOfList != null) {
            headOfList.print();
            System.out.println("the length of the int list is = "
                    + headOfList.length());
        }

        headOfList = null;
        LinkedListStringNode newStringNode;

        System.out.println("Enter strings to put in linked list.");
        System.out.println("And empty line (no blanks!) ends input.");
        String s = readString("? ");
        while (s != null) {
            newStringNode = new LinkedListStringNode();
            newStringNode.stringData = s;
            headOfList = newStringNode.add(headOfList);
            s = readString("? ");
        }

        if (headOfList != null) {
            headOfList.print();
            System.out.println("the length of the string list is = "
                    + headOfList.length());
        }

    }

}



