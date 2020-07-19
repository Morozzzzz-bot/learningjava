package operators;
import converter.Converter;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class CoinTossTest {

    @Test
    public void coinsToss5() {
        Random rand = new Random(5);
        int rsl = rand.nextInt(10);
        String out = CoinToss.moneyToss(rsl);
        Assert.assertEquals("Орёл", out);
    }

    @Test
    public void coinsToss3() {
        Random rand = new Random(3);
        int rsl = rand.nextInt(10);
        String out = CoinToss.moneyToss(rsl);
        Assert.assertEquals("Решка", out);
    }
}
