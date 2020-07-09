package condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double resultOne = Point.distance(0, 0, 2, 0);
        double resultTwo = Point.distance(2, 4, 4, 8);
        double resultThird = Point.distance(2, 2, 2, 2);
        System.out.println("result (0, 0) to (2, 0) " + resultOne);
        System.out.println("result (2, 4) to (4, 8) " + resultTwo);
        System.out.println("result (2, 2) to (2, 2) " + resultThird);
    }
}
