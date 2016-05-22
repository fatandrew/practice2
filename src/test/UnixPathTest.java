package test;

import com.company.UnixPath;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 22.05.2016.
 */
public class UnixPathTest extends UnixPath {
UnixPath unixPath = new UnixPath();

    @Test
    public void testSimplifyPath() throws Exception{
        String a =  "/home/../var/./lib//file.txt";
        String expected = "/var/lib/file.txt";
        String actualResult = unixPath.simplify(a);

        Assert.assertEquals(expected, actualResult);
    }

}