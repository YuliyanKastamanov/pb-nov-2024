package _04_ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int mutesCount = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double decorationPrice = budget * 0.10;
        double mutesClothingPrice = mutesCount * clothingPrice;

        if (mutesCount > 150) {
            mutesClothingPrice = mutesClothingPrice * 0.9;
        }

        double totalSum = decorationPrice + mutesClothingPrice;

        if (totalSum > budget) {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", totalSum - budget);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - totalSum);
        }

    }
}
