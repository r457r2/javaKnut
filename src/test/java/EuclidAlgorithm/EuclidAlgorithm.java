package EuclidAlgorithm;

/**
 * Created by royabanz on 28.04.2017.
 * Algorithm for greatest common divisor.
 */
public class EuclidAlgorithm {
    public static int findGCD(int first, int second){
        if (first < 0 || second < 0) {
            throw new IllegalArgumentException("Arguments must be more then zero.");
        }

        int reminder = first % second;
        while (reminder != 0) {
            first = second;
            second = reminder;
            reminder = first % second;
        }
        return second;
    }
}
