package d_objects;

public class ObjectExample {

    public static void main(String[] args) {
        A q;
        q = new A(); // syntax to instantiate an object

        q.k = 4;    // syntax to access the instance variable of an object
        System.out.println("q.k= " + q.k);  // prints 4

        A r;
        r = new A();
        r.k = 2;

        System.out.println("q.k= " + q.k); // prints 4
        System.out.println("r.k= " + r.k); // prints 2

        r.incrementK(); // syntax to invoke a method of an object

        System.out.println("q.k= " + q.k); // prints 4
        System.out.println("r.k= " + r.k); // prints 3

        A u;
        u = q;    // u is an "alias" for q
        u.incrementK();

        System.out.println("q.k= " + q.k); // prints 5
        System.out.println("r.k= " + r.k); // prints 3
    }
}

class A {
    int k;  // instance variable

    void incrementK()  // instance method
    {
        k++;
    }
}


