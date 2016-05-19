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
String a="zjfghfhdsdfathjjhgjhghjfjfjhjhdsrreqqklhu456hfz5";
        String b = "wsfgsgds56346263fgfhghfghfhgfsrr5476hjfgdhdhg3N";
        String expected="b";
        String actualResult = addNumberBase36.add(a, b);
        System.out.println(actualResult);
        Assert.assertEquals(expected,actualResult);
    }

}