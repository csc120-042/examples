package b_assertions;

public class AssertExample {

// burton rosenberg
// 5 feb, 2004

// introduction to assertions.
// NOTE: in Java 1.4.2 assertion become part of the language
// prior to 1.4.2 they are comments, or sometimes code that you
// write. we are glad that Java definers have decided to make
// them part of the language.

    public static void main(String[] args) {
        int n;
        n = 3;

        // ASSERT n is even
        if ((n % 2) != 0) {
            System.out.println("assert failed line 12");
            System.exit(0);
        }

        // in Java 1.4.2, assert has been introduced as an operator.
        // we will be able to say:
        assert ((n % 2) != 0);
        // instead of all the code above.

        // do more stuff

    }

}

