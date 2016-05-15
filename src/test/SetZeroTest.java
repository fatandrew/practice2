package test;

import com.company.SetZero;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 15.05.2016.
 */
public class SetZeroTest extends SetZero {
SetZero setZero = new SetZero();

    @Test
    public void testSetZero() throws Exception{
        int a = 6;
        int i = 2;
        int expected = 4;
        int actualResult = setZero.set(a, i);
        
        Assert.assertEquals(expected,actualResult);
    }
}