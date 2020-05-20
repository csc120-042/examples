package d_objects;
/*
	(c) 1998 Burton Rosenberg. All rights reserved.
*/

public class ObjectTwoTest {
    public static void main(String[] args) {
        ObjectTwo o2 = new ObjectTwo();
        while (o2.hasMore()) {
            System.out.println(o2.getNext());
        }
        o2.reset();
        for (int i = 0; i < 10; i++) {
            System.out.println(o2.getNext());
        }
    }
}
