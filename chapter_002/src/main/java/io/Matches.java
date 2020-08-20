package io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11 спичек ");
        boolean run = true;
        int matchers = 11;
        while (run) {
            System.out.println("Введите цифру от 1 до 3 включительно!");
            System.out.println("Игрок 1");
            int player1 = Integer.valueOf(input.nextLine());
            matchers -= player1;
            System.out.println("Осталось спичек - " + matchers);
            if (matchers < 0) {
                System.out.println("Победил 1 игрок");
                break;
            }
            System.out.println("Игрок 2");
            int player2 = Integer.valueOf(input.nextLine());
            matchers -= player2;
            System.out.println("Осталось спичек - " + matchers);
            if (matchers < 0) {
                System.out.println("Победил 2 игрок");
                break;
            }
        }
    }
}
