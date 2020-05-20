package b_assertions;

// burton rosenberg
// 5 feb, 2004

// we now know loops, we will
// look at loop invariants

public class Factorial {

    static final int N = 1000;

    public static void main(String[] args) {
        int f;
        // ASSERT N > 0   (hey this is a precondition)

        int i;
        i = 1;
        f = 1;
        // LOOP INVARIANT: ASSERT f = i!

        while (i < N) {
            i++;
            f = f * i;
            // ASSERT LOOP INVARIANT
        }
        // ASSERT LOOP INVARIANT

        // ASSERT f = N!  (hey this is a postcondition)
        System.out.println(N + " factorial = " + f);
    }

}
