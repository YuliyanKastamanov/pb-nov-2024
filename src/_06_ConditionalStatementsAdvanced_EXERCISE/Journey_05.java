package _06_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String place = "";
        String type = "";
        double moneySpent = 0.0;

        if (budget <= 100) {
            place = "Bulgaria";
            if (season.equals("summer")) {
                moneySpent = 0.30 * budget;
                type = "Camp";
            } else {
                moneySpent = 0.70 * budget;
                type = "Hotel";
            }
        } else if (budget <= 1000) {
            place = "Balkans";
            if (season.equals("summer")) {
                moneySpent = 0.40 * budget;
                type = "Camp";
            } else {
                moneySpent = 0.80 * budget;
                type = "Hotel";
            }
        } else if (budget > 1000) {
            place = "Europe";
            type = "Hotel";
            moneySpent = 0.90 * budget;
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", place, type, moneySpent);

    }
}
