package test;

import com.company.AddNumberBase36;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 10.05.2016.
 */
public class AddNumberBase36Test extends AddNumberBase36 {
AddNumberBase36 addNumberBase36=new AddNumberBase36();

    @Test
public void testAddNumber36() throws Exception{
String a="2";
        String b = "k";
        String expected="4";
        String actualResult = addNumberBase36.add(a, b);
        System.out.println(actualResult);
        Assert.assertEquals(expected,actualResult);
    }

}