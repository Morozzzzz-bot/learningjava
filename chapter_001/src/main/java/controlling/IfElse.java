package controlling;

public class IfElse {
    static int test(int testval, int begin, int end) {
        int rsl = 0;
        if (begin > end) {
            return 0;
        }
        if (begin < testval && testval < end) {
            rsl = 1;
        } else if (begin > testval || testval > end) {
            rsl = -1;
        }
        return rsl;

    }
}
