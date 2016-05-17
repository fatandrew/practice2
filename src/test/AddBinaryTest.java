package test;

import com.company.AddBinary;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 15.05.2016.
 */
public class AddBinaryTest extends AddBinary {
AddBinary addBinary = new AddBinary();

    @Test
    public void testAdding() throws Exception{
        String b = "1001";
        String c = "11";
        String expected = "1100000000000000000000000000000000000000000000000000000000000010111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111110000000000000000011111111111111111111111111111110";
        String actualResult = addBinary.add(b, c);
        System.out.println(actualResult);
        Assert.assertEquals(expected,actualResult);
    }
}