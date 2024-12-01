package _10_WhileLoop_EXERCISE;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());

        money = money * 100;
        // money *= 100;

        int coinsCounter = 0;

        while (money > 0) {

            if (money >= 200) {
                money -= 200;
            } else if (money >= 100) {
                money -= 100;
            } else if (money >= 50) {
                money -= 50;
            } else if (money >= 20) {
                money -= 20;
            } else if (money >= 10) {
                money -= 10;
            } else if (money >= 5) {
                money -= 5;
            } else if (money >= 2) {
                money -= 2;
            } else if (money >= 1) {
                money -= 1;
            } else {
                break;
            }

            coinsCounter++;
        }

        System.out.println(coinsCounter);


    }
}
