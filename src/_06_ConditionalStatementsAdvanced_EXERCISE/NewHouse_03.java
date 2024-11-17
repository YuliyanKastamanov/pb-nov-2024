package _06_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        //"Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
        //5	        3.80	    2.80	    3	        2.50

        double finalPrice = 0.0;

        switch (flower) {
            case "Roses" -> {
                finalPrice = 5.0 * count;

                if (count > 80) {
                    finalPrice = finalPrice - (finalPrice * 0.10);
                }
            }
            case "Dahlias" -> {
                finalPrice = 3.80 * count;

                if (count > 90) {
                    finalPrice = finalPrice - (finalPrice * 0.15);
                }
            }
            case "Tulips" -> {
                finalPrice = 2.80 * count;

                if (count > 80) {
                    finalPrice = finalPrice - (finalPrice * 0.15);
                }
            }
            case "Narcissus" -> {
                finalPrice = 3.0 * count;

                if (count < 120) {
                    finalPrice = finalPrice + (finalPrice * 0.15);
                }
            }
            case "Gladiolus" -> {
                finalPrice = 2.50 * count;

                if (count < 80) {
                    finalPrice = finalPrice + (finalPrice * 0.20);
                }
            }
        }

        if (budget >= finalPrice) {
            System.out.printf("Hey, you have a great garden with %d " +
                    "%s and %.2f leva left.", count, flower, budget - finalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", finalPrice - budget);
        }

    }
}
