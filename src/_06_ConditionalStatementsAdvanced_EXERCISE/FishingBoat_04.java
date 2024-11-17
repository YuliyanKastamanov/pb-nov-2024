package _06_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());


        double shipPrice = 0.0;
        switch (season) {
            case "Spring" -> shipPrice = 3000.0;
            case "Summer", "Autumn" -> shipPrice = 4200.0;
            case "Winter" -> shipPrice = 2600.0;
        }

        if (fishersCount <= 6) {
            shipPrice = shipPrice - (shipPrice * 0.10);
        } else if (fishersCount <= 11) {
            shipPrice = shipPrice - (shipPrice * 0.15);
        } else {
            shipPrice = shipPrice - (shipPrice * 0.25);
        }

        if (fishersCount % 2 == 0 && !(season.equals("Autumn")) ) {
            shipPrice = shipPrice - (shipPrice * 0.05);
        }

        if (budget >= shipPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - shipPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", shipPrice - budget);
        }
    }
}
