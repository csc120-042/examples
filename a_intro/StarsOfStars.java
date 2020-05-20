package a_intro;
// burton rosenberg
// 3 feb, 2004

// this program introduces nested while loops

public class StarsOfStars {

    static final int NUM_OF_STARS_MAX = 6;

    public static void main(String[] args) {
        int numOfStars;
        numOfStars = NUM_OF_STARS_MAX;

        while (numOfStars > 0) {

            // print one row of stars, of length numOfStars
            int i;
            i = numOfStars;
            while (i > 0) {
                System.out.print('*');
                i--;
            }
            System.out.println();

            // next row print one less star
            numOfStars--;
        }
    }
}
