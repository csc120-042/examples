package b_assertions;

// burton rosenberg
// 7 feb, 2004

// The theory:

//   MOTIVATION
//   The greatest common divisor of two positive integers a and b
//   is the largest number c which divides evenly both a and b.
//   One meets this concept first when reducing fractions. For
//   instance the greatest common divisor of 42 and 35 is 7, so
//   35/42 is written in lowest form as 5/6 after dividing both
//   numerator and denominator by the gcd (greatest common divisor).

//   ALGORITHM
//   In symbols, the gcd of a and b is written as a function gcd(a,b).
//   The idea of the algorithm is that gcd(a,b) = gcd(b,a%b), where
//   a%b is the remainder after a is divided by b.
//   Note a = gcd(a,0), and by repeating the above reduction we
//   will eventually get to this "easy" case.

public class GreatestCommonDivisorLoopInvar {
    
    static final int A = 42;
    static final int B = 35;

    public static void main(String[] args) {
        // precondition, A >= B >= 0.
        int a;
        int b;
        int gcd;

        a = A;
        b = B;

        // Loop Invariant: (1) gcd(a,b) = gcd(A,B)
        //             and (2) a>=b>=0.

        // ASSERT Loop Invariant (why is it true?)
        while (b > 0) {
            int t; // just a temporary (Question: what is the scope of t?)
            t = a % b;
            a = b;
            b = t;
            // ASSERT Loop Invariant, (1) gcd(a,b) = gcd(A,B)
            // and (2) a >= b >= 0
        }

        // Loop Invariant + Termination = Goal
        gcd = a; // because gcd(a,0) is a

        // postcondition gcd = GreatestCommonDivisor of A and B
        System.out.println("The GCD of " + A + " and " + B + " is " + gcd);
    }

}
