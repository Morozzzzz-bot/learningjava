package operators;
class Box {
    char c;
}
public class Boxes {
    static void f(Box y) {
        y.c = 'l';
    }

    public static void main(String[] args) {
        Box t1 = new Box();
        t1.c = 'a';
        System.out.println(t1.c);
        f(t1);
        System.out.println(t1.c);
    }
}
