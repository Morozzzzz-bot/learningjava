package everything;

public class DataOnlyTest {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            boolean b;
            void show() {
                System.out.println(i);
                System.out.println(b);
            }
        }
        DataOnly a = new DataOnly();
        a.i = 3;
        a.b = false;
        a.show();
    }
}
