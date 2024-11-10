package ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSeries = scanner.nextLine();
        int seriesTime = Integer.parseInt(scanner.nextLine());
        int restTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = restTime / 8.0;
        double restingTime = restTime / 4.0;

        double remainingTime = restTime - lunchTime - restingTime;

        if (remainingTime >= seriesTime) {
            System.out.printf("You have enough time to watch %s and " +
                    "left with %.0f minutes free time.", nameSeries, Math.ceil(remainingTime - seriesTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    nameSeries, Math.ceil(seriesTime - remainingTime));
        }

    }
}
