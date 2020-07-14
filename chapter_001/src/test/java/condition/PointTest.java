package condition;

import converter.Converter;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distancePointTest() {
        double out = Point.distance(0, 0, 2, 0);
        double expected = 2.0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distancePointTestTwo() {
        double out = Point.distance(2, 4, 4, 8);
        double expected = 4.47213595499958;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distancePointTestThird() {
        double out = Point.distance(2, 2, 2, 2);
        double expected = 0.0;
        Assert.assertEquals(expected, out, 0.01);
    }
}
