package d_objects;

/*
	(c) 1998 Burton Rosenberg. All rights reserved.
*/

public class ObjectOneTest {
    public static void main(String[] args) {
        ObjectOne o1 = new ObjectOne();
        int i;
        while ((i = o1.getNext()) < 10) {
            System.out.println(i);
        }
        o1.reset();
        while ((i = o1.getNext()) < 5) {
            System.out.println(i);
        }
    }
}
