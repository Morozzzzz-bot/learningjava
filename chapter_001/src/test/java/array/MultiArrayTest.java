package array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiArrayTest {
    @Test
    public void notFirst4() {
        double[][] rsl = MultiArray.multiDouble(4, 4, 5.6, 9.6);
        System.out.println(MultiArray.printArrays(rsl));
        assertThat(rsl.length, is(4));
    }

    @Test
    public void notFirst9() {
        double[][] rsl = MultiArray.multiDouble(9, 9, 6, 15);
        System.out.println(MultiArray.printArrays(rsl));
        assertThat(rsl.length, is(9));
    }

    @Test
    public void notFirstNull() {
        MultiArray[][] rsl = new MultiArray[5][5];
        System.out.println(Arrays.deepToString(rsl));
        assertThat(rsl.length, is(5));
    }
}
