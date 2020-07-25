package controlling;

import operators.CoinToss;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class SimpleCountTest {
    @Test
    public void simpleTestOne() {
        SimpleCount.simple(10);
    }

    @Test
    public void simpleTestTwo() {
        SimpleCount.simple(1000);
    }

}
