package c_recursion;

public class PowerRecursive {

    static int power(int i, int j) {
        // i to the power j
        if (j == 0) return 1;
        if (j % 2 == 0) { // j even
            int k = power(i, j / 2);
            return k * k;
        } else { // j odd
            return i * power(i, j - 1);
        }
    }

    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        System.out.println(i + " to the power " + j + " equals " + power(i, j));
    }

}
