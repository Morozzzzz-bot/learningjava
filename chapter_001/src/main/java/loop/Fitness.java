package loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (true) {
            if (ivan > nik) {
                break;
            }
            month++;
            ivan *= 3;
            nik *= 2;
        }
        return month;
    }
}
