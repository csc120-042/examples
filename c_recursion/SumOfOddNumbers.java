package c_recursion;

public class SumOfOddNumbers {

    static final int NUMBER_OF_ODDS = 5;

    static int sumOdds(int anOddNumber) {
        if (anOddNumber <= 1) {
            return 1;
        } else {
            return anOddNumber + sumOdds(anOddNumber - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOdds(2 * NUMBER_OF_ODDS - 1));
    }
}
