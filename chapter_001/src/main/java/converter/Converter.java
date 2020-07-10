package converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int inD = 240;
        int expectedD = 4;
        int outD = rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("240 rubles are 4. Test result : " + passedD);
    }

}
