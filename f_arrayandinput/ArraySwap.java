package f_arrayandinput;
/*
 * class ArraySwap
 * burton rosenberg
 * march 2002
 */

public class ArraySwap extends ReadInteger {

    int[] theArray = null;


    void swap(int i, int j) {
        if (theArray == null) {
            return;
        }
        if (i < 0 || j < 0 || i >= theArray.length || j >= theArray.length) {
            return;
        }
        int t;
        t = theArray[i];
        theArray[i] = theArray[j];
        theArray[j] = t;
    }


    void printArray() {
        System.out.println("theArray:");
        if (theArray != null) {
            for (int i = 0; i < theArray.length; i++) {
                System.out.println(theArray[i]);
            }
        }
    }

    void fillArray(int n) {
        if (theArray == null || theArray.length != n) {
            theArray = new int[n];
        }
        for (int i = 0; i < theArray.length; i++) {
            theArray[i] = readInteger("Integer? ");
        }
    }

}



