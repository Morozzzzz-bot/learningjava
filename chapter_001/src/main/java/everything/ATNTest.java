package everything;

public class ATNTest {
    public static void main(String[] args) {
        class ATypeName {
            int i;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(b);
            }
        }
        ATypeName a = new ATypeName();
        a.i = 3;
        a.b = false;
        a.show();
    }
}
