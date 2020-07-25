package controlling;

import java.util.Random;

public class CompareRandom {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        while (true) {
            int countOne = rand1.nextInt();
            int countTwo = rand2.nextInt();
            if (countOne < countTwo) {
                System.out.println("countOne < countTwo");
            } else if (countOne > countTwo) {
                System.out.println("countOne > countTwo");
            } else {
                System.out.println("countOne == countTwo");
            }
        }
    }
}
