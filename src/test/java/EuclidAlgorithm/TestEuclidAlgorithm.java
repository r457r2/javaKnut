package EuclidAlgorithm;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static EuclidAlgorithm.EuclidAlgorithm.findGCD;
import static org.junit.Assert.assertEquals;


/**
 * Created by royabanz on 28.04.2017.
 * test for my GCD algorithm
 */
public class TestEuclidAlgorithm {
    private int clauses[][];

    @Before
    public void setUp(){
        clauses = new int[3][3];
        clauses[0] = new int[]{2, 4, 2};
        clauses[1] = new int[]{545, 15, 5};
        clauses[2] = new int[]{44, 5200, 4};
    }

    @Test
    public void testGCD(){
        for (int i[]: clauses) {
            int actualGcd = findGCD(i[0], i[1]);
            int expectedGcd = i[2];

            assertEquals(expectedGcd, actualGcd);
        }
    }
}
