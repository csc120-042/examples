package c_recursion;

public class Power {

    static int power(int i, int j) {
        // compute i^j
        int k = 1;
        // L.I. k = i^l, where l is number times through loop
        while (j > 0) {
            k = k * i;
            j--;
        }
        // Termination, went through loop j times
        // L.I. + Terminatation => k = i^j
        return k;
    }

    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        System.out.println(i + " to the power " + j + " equals " + power(i, j));
    }

}
