package condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To2Then4() {
        int result = Max.max(4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax5To7Then7() {
        int result = Max.max(5, 7, 9,10);
        assertThat(result, is(10));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2,5,7);
        assertThat(result, is(7));
    }
}
