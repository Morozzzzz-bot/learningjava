package condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int resultOne = first > second ? first : second;
        int resultTwo = resultOne > third ? resultOne : third;
        return resultTwo;
    }
}