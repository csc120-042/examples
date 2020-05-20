package a_intro;

public class SumIntLooping {

    static final int N = 6;

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i < N) {
            sum = sum + i; // update
            i++; // move along ...
        }
        System.out.println(sum);
    }
}

