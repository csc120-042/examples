package e_strings;

public class Palindrome
{

    public static void main(String[] args)
    {
        String testString = "able was i ere i saw elba" ;
        System.out.println( isPalindrome(testString) ) ;
    }

    static
    boolean isPalindrome(String s)
    {
        // return true if s is a palindrome
        int leftCharToCheck ;
        int rightCharToCheck ;

        // begin the left at the first character, and the right at the last
        leftCharToCheck =  0 ;
        rightCharToCheck = s.length() - 1 ;

        while (  leftCharToCheck < rightCharToCheck  )
        {
            char lchar = s.charAt( leftCharToCheck ) ; // the char at leftCharToCheck
            char rchar = s.charAt( rightCharToCheck ) ;
            if ( lchar != rchar  )
            {
                return false ;
            }
            // ok so those are equal, continue looking
            leftCharToCheck ++ ;
            rightCharToCheck -- ;
        }
        return true ;
    }

}
