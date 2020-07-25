package controlling;

import operators.CoinToss;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class IfElseTest {
    @Test
    public void test10() {
        int out = IfElse.test(10, 5, 4);
        Assert.assertEquals(0, out);
    }

    @Test
    public void test8() {
        int out = IfElse.test(10, 5, 12);
        Assert.assertEquals(1, out);
    }

    @Test
    public void test6() {
        int out = IfElse.test(6, 7, 9);
        Assert.assertEquals(-1, out);
    }
}
