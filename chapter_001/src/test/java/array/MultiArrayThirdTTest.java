package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiArrayThirdTTest {
    @Test
    public void notFirst4() {
        double[][][] rsl = MultiArrayThird.multiDouble(4, 4, 4, 5.6, 9.6);
        System.out.println(MultiArrayThird.printArrays(rsl));
        assertThat(rsl.length, is(4));
    }

    @Test
    public void notFirst9() {
        double[][][] rsl = MultiArrayThird.multiDouble(9, 9, 9, 6, 15);
        System.out.println(MultiArrayThird.printArrays(rsl));
        assertThat(rsl.length, is(9));
    }
}
