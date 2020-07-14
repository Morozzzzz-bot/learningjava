package calculator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight182() {
        double in = 187.0;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight182() {
        double in = 187.0;
        double expected = 88.55;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}

