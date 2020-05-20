package f_arrayandinput;

/*
 * class ArraySwapTest
 * burton rosenberg
 * march 2004
 */

class ArraySwapTest extends ReadInteger {

    public static void main(String[] args) {

        ArraySwap as = new ArraySwap();
        int n = readPosInteger("Array size: ",
                "Input be postive: ");
        as.fillArray(n);
        as.printArray();
        as.swap(0, n - 1);
        as.printArray();
    }

}

