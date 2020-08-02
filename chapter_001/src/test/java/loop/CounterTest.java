package loop;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbersFromTwoToSevenThenThirty() {
        int rsl = Counter.sumByEven(2, 7);
        int expected = 12;
        assertThat(rsl, is(expected));
    }
}
