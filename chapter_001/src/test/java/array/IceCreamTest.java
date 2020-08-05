package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class IceCreamTest {
    @Test
    public void notFirst4() {
        TestArray[] rsl = IceCream.arrayTest(4);
        for (TestArray count: rsl) {
            System.out.println(count);
        }
        assertThat(rsl.length, is(4));
    }

    @Test
    public void notFirst9() {
        TestArray[] rsl = IceCream.arrayTest(9);
        for (TestArray count: rsl) {
            System.out.println(count);
        }
        assertThat(rsl.length, is(9));
    }
}
