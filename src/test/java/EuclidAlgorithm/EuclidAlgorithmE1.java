package EuclidAlgorithm;

/**
 * Created by royabanz on 28.04.2017.
 * Algorithm for greatest common divisor.
 */
public class EuclidAlgorithmE1 {
    public static int findGCD(int first, int second){
        if (first < 0 || second < 0) {
            throw new IllegalArgumentException("Arguments must be more then zero.");
        }

        //E1
        int reminder = first % second;
        //E2
        while (reminder != 0) {
            //E3
            first = second;
            second = reminder;
            reminder = first % second;
        }
        return second;

//        Именно такая версия предлагается Кнутом
//        while (true) {
//            //E1
//            int reminder = first % second;
//            //E2
//            if (reminder == 0) {
//                return second;
//            }
//
//            //E3
//            first = second;
//            second = reminder;
//        }
    }
}
