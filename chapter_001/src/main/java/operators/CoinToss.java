package operators;

public class CoinToss {
    static String moneyToss(int a) {
        String toss = null;
        if (a < 5) {
            toss = "Решка";
        } else if (a > 5) {
            toss = "Орёл";
        } else {
            toss = "Ничья";
        }
        return toss;
    }
}
