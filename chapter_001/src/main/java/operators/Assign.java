package operators;
class Tube {
    float lenght;
}
public class Assign {
    public static void main(String[] args) {
        Tube t1 = new Tube();
        Tube t2 = new Tube();
        t1.lenght = 2.08f;
        t2.lenght = 8.03f;
        System.out.println("t1 = " + t1.lenght + "  " + "t2 = " + t2.lenght);
        t1.lenght = t2.lenght;
        System.out.println("t1 = " + t1.lenght + "  " + "t2 = " + t2.lenght);
        t1.lenght++;
        t1.lenght++;
        System.out.println("t1 = " + t1.lenght + "  " + "t2 = " + t2.lenght);
        t1 = t2;
        System.out.println("t1 = " + t1.lenght + "  " + "t2 = " + t2.lenght);
        t1.lenght--;
        t1.lenght--;
        System.out.println("t1 = " + t1.lenght + "  " + "t2 = " + t2.lenght);
    }
}
