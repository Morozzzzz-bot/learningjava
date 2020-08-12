package condition;

import converter.Converter;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distancePointTest() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        double expected = 2.0;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distancePointTestTwo() {
        Point a = new Point(2, 4);
        Point b = new Point(4, 8);
        double out = a.distance(b);
        double expected = 4.47213595499958;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distancePointTestThird() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        double expected = 0.0;
        Assert.assertEquals(expected, out, 0.01);
    }
}
