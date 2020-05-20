package d_objects;
/*
  (c)1998 Burton Rosenberg. All rights reserved.
  A first object.
*/


// class description
public class ObjectTwo {
    // instance variables

    char letter = 'A';

    // methods

    char getNext() {
        if (letter > 'Z') {
            return 'Z';
        } else {
            return letter++;
        }
    }

    void reset() {
        letter = 'A';
    }

    boolean hasMore() {
        return (letter <= 'Z');
    }
}
