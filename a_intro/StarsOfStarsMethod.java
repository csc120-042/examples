package a_intro;

public class StarsOfStarsMethod {
// burton rosenberg
// 3 feb, 2004

// this program introduces methods


    static final int NUM_OF_STARS_MAX = 6;

    static void lineOfStars(int howManyStars) // signature of method
    {
        // print one row of stars, of length numOfStars
        while (howManyStars > 0) {
            System.out.print('*');
            howManyStars--;
        }
        System.out.println();
    }

    public static void main(String[] args)  //signature of method
    {
        int numOfStars;
        numOfStars = NUM_OF_STARS_MAX;

        while (numOfStars > 0) {
            lineOfStars(numOfStars);
            // next line print one less star
            numOfStars--;
        }
    }
}

