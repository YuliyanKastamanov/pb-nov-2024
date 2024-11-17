package _06_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysToStay = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String grade = scanner.nextLine();

        int nights = daysToStay - 1;
        double finalPrice = 0.0;

        switch (roomType) {
            case "room for one person" -> {
                finalPrice = 18.0 * nights;
            }
            case "apartment" -> {
                finalPrice = 25.0 * nights;

                if (daysToStay < 10) {
                    finalPrice = finalPrice * 0.70;
                } else if (daysToStay <= 15) {
                    finalPrice = finalPrice * 0.65;
                } else if (daysToStay > 15) {
                    finalPrice = finalPrice * 0.50;
                }
            }
            case "president apartment" -> {
                finalPrice = 35.0 * nights;

                if (daysToStay < 10) {
                    finalPrice = finalPrice * 0.90;
                } else if (daysToStay <= 15) {
                    finalPrice = finalPrice * 0.85;
                } else if (daysToStay > 15) {
                    finalPrice = finalPrice * 0.80;
                }
            }
        }

        if (grade.equals("positive")) {
            finalPrice = finalPrice * 1.25;
        } else {
            finalPrice = finalPrice * 0.90;
        }

        System.out.printf("%.2f", finalPrice);

    }
}
