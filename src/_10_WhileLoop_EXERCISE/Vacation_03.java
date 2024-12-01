package _10_WhileLoop_EXERCISE;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        int spendCounter = 0;
        int daysCounter = 0;

        while (currentMoney < tripPrice) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            daysCounter++;

            switch (command) {
                case "save" -> {
                    currentMoney += money;
                    spendCounter = 0;
                }
                case "spend" -> {
                    currentMoney -= money;
                    spendCounter++;

                    if (currentMoney <= 0) {
                        currentMoney = 0;
                    }
                }
            }

            if (spendCounter >= 5) {
                break;
            }
        }


        if (currentMoney >= tripPrice) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        } else {
            System.out.printf("You can't save the money.%n%d", daysCounter);
        }
    }
}
