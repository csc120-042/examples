package a_intro;
// burton rosenberg
// 3 feb, 2004

public class Stars
{
    static final int NUM_OF_STARS = 6 ;

    public static
    void main ( String [ ] args )
    {
        int i ;
        i = NUM_OF_STARS ;

        while ( i>0 )
        {
            System.out.print('*') ;
            i-- ;
        }

        // print the newline
        System.out.println() ;
    }
}

