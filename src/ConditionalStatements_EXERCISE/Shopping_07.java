package ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());

        int videoCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videoPrice = videoCount * 250.0;
        double processorsPrice = (videoPrice * 0.35) * processorsCount;
        double ramPrice = (videoPrice * 0.10) * ramCount;

        double sumAll = videoPrice + processorsPrice + ramPrice;

        if (videoCount > processorsCount) {
            sumAll = sumAll - (sumAll * 0.15);
        }

        if (budget >= sumAll) {
            System.out.printf("You have %.2f leva left!",budget - sumAll);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", sumAll - budget);
        }

    }
}
