package controlling;

public class Count {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i == 99) {
                break;
            }
            if (i == 98) {
                return;
            }
            System.out.println(i);
        }
    }
}
