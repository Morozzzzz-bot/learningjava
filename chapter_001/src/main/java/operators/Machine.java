package operators;
class Calculators {
    static float distTime(float dist, float time) {
        if (time == 0) {
            return 0f;
        } else {
            return dist / time;
        }
    }
}
public class Machine {
    public static void main(String[] args) {
        float dist = 343.4f;
        float time = 5.6f;
        float rsl = Calculators.distTime(dist, time);
        System.out.println(rsl);
    }


}
