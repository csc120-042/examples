package a_intro;

public class HelloWorld   // file must be called intro.HelloWorld.java
{
    public static  // pure magic
    void main  ( String [] args  )  // method signature
    {
        // in the System object, get the out object, invoke
        // its println method with argument "Hello World",
        // which is a string literal
        System.out.println("Hello World") ;

        // integer literals, operators on literals
        System.out.println( 2 + 3 ) ;  // plus operator on integer type
        System.out.println( "2" + "3" ) ; // plus operator on String type
    }
}
