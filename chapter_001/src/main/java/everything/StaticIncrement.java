package everything;

public class StaticIncrement {
    public static void main(String[] args) {
        StaticInc st1 = new StaticInc();
        StaticInc st2 = new StaticInc();
        System.out.println("st1.i= " + st1.i);
        System.out.println("st2.i= " + st2.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
        Incrementable.increment();
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);
    }
}
