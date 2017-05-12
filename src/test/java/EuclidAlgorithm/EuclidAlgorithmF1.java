package EuclidAlgorithm;

/**
 * Created by royabanz on 12.05.2017.
 * Simplified wersion of euclid algorithm
 */
public class EuclidAlgorithmF1 {
    public static int findGCD(int first, int second){
        int result;
        while (true) {
            first = first % second;
            if (first == 0) {
                result = second;
                break;
            }
            second = second % first;
            if (second == 0) {
                result = first;
                break;
            }
        }

        return result;
    }
}
