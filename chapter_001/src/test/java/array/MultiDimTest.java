package array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiDimTest {
    @Test
    public void notFirstNull() {
        MultiArray[][] rsl = MultiDim.multi(4, 4);
        System.out.println(Arrays.deepToString(rsl));
        assertThat(rsl.length, is(4));
    }
}
