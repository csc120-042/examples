package d_objects;
/*
  (c)1998 Burton Rosenberg. All rights reserved.
  A first object.
*/

public class ObjectOne {
    // instance variables

    int count = 0;

    // methods

    int getNext() {
        return count++;
    }

    void reset() {
        count = 0;
    }
}
