package algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApproximationTest {

    @Test
    public void testTriangularSum()
    {
        int numberOfElements = 100;

        long expectedSum = triangularSum(numberOfElements);
        double sum = Approximation.triangularSum(numberOfElements);

        System.out.println("Difference for triangular elements, % :" + calculatePercentageDifference(sum, expectedSum));
    }

    private double calculatePercentageDifference(double a, double b)
    {
        return 100*(b-a)/b;
    }

    private long triangularSum(int numberOfElements)
    {
        long sum = 0;
        for (int i = 1; i <= numberOfElements; i++)
        {
            sum += i;
        }
        return sum;
    }
}