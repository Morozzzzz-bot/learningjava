package array;

import loop.Counter;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void squareTestCalculate4() {
        int[] rsl = Square.calculate(4);
        int[] expected = {0, 1, 4, 9};
        assertThat(rsl, is(expected));
    }

    @Test
    public void squareTestCalculate5() {
        int[] rsl = Square.calculate(5);
        int[] expected = {0, 1, 4, 9, 16};
        assertThat(rsl, is(expected));
    }
}
