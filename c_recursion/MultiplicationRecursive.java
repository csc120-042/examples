package c_recursion;

public class MultiplicationRecursive {
    static int multiplication(int i, int j) {
        // ASSERT i,j >=0 ;
        if (i == 0) return 0;
        return j + multiplication(i - 1, j);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a + " * " + b + " = " + multiplication(a, b));
    }

}
