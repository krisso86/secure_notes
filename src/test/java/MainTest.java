/**
 * Created by Krzysztof on 2016-04-24.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class MainTest {


    @Test
    public void testingCrunchifyAddition() {
        assertEquals("Here is test for Addition Result: ", 30, addition(27, 3));
    }


    public int addition(int x, int y) {
        return x + y;
    }
}
