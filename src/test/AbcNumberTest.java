package test;

import com.company.AbcNumber;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 14.05.2016.
 */
public class AbcNumberTest extends AbcNumber {
AbcNumber abcNumber = new AbcNumber();

    @Test
public void testAbcToNummber() throws Exception{
        String p = "bcd";
        int expected = 123;
        int actualResult = abcNumber.convert(p);
        Assert.assertEquals(expected,actualResult);


    }

}