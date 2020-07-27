package controlling;

public class Fibonacci {
    static void fib(int i) {
        int a = 1;
        int b = 1;
        int sumFib;
        for (int j = 0; j < i; j++) {
            System.out.println(a);
            sumFib = a + b;
            a = b;
            b = sumFib;
        }
    }
}
