package test;

import com.company.CountBits;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 15.05.2016.
 */
public class CountBitsTest extends CountBits {
CountBits countBits = new CountBits();

    @Test
    public void testCountBits() throws Exception{
        int a = 13;
        int expected = 3;
        int actualResult = countBits.count(a);
        System.out.println(actualResult);
        Assert.assertEquals(expected, actualResult);
    }
}