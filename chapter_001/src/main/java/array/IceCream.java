package array;

public class IceCream {
    public static TestArray[] arrayTest(int count) {
        TestArray[] rsl = new TestArray[count];
        for (int i = 0; i < count; i++) {
            rsl[i] = new TestArray();
        }
        return rsl;
    }
}
