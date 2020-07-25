package controlling;

public class SimpleCount {
    static void simple(int count) {
        for (int i = 1; i < count; i++) {
            int number = 0;
            for (int j = 1; j < count; j++) {
                if (i % j == 0) {
                    number++;
                }
            }
            if (number <= 2) {
                System.out.println(i + " Простое число");
            }
        }
    }
}
