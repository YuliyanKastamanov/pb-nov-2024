package _08_ForLoop_EXERCISE;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N = age
        int N = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int toysCount = 0;
        int birthdayMoneyTracker = 0;

        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0) {
                // money
                birthdayMoneyTracker += 10;
                sum += birthdayMoneyTracker;

                sum--;
            }
            else {
                // toys
                toysCount++;
            }
        }

        int totalPriceToys = toysCount * toyPrice;
        sum += totalPriceToys;

        if (sum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", sum - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - sum);
        }

    }
}
