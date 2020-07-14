package condition;

import converter.Converter;
import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void sqareaOne() {
        int k = 1;
        int p  = 4;
        double expected = 1.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void sqareaTwo() {
        int k = 2;
        int p  = 6;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
