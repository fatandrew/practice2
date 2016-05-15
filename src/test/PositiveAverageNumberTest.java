package test;

import com.company.PositiveAverageNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 11.05.2016.
 */
public class PositiveAverageNumberTest extends PositiveAverageNumber {
PositiveAverageNumber positiveAverageNumber = new PositiveAverageNumber();

    @Test
            public void testFindAverageNumber() throws Exception{
    int a = -4;
    int b = 7;
        int expected = 2147;
        int actualResult = positiveAverageNumber.average(a, b);
        Assert.assertEquals(expected, actualResult);
}}