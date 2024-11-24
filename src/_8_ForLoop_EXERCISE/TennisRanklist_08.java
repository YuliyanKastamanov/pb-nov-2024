package _8_ForLoop_EXERCISE;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int currentPoints = 0;
        int wonTournamentsCount = 0;

        for (int i = 1; i <= tournamentsCount; i++) {
            String result = scanner.nextLine();

            if (result.equals("W")) {
                currentPoints += 2000;
                wonTournamentsCount++;
                // wonTournamentsCount += 1;
            } else if (result.equals("F")) {
                currentPoints += 1200;
            } else if (result.equals("SF")) {
                currentPoints += 720;
            }

        }

        System.out.printf("Final points: %d%n", currentPoints + startingPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(1.0 * currentPoints / tournamentsCount));
        System.out.printf("%.2f%%", 1.0 * wonTournamentsCount / tournamentsCount * 100);
    }
}
