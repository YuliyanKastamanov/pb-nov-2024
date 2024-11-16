package _04_ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSeconds = Integer.parseInt(scanner.nextLine());
        int secondSeconds = Integer.parseInt(scanner.nextLine());
        int thirdSeconds = Integer.parseInt(scanner.nextLine());

        int sumSeconds = firstSeconds + secondSeconds + thirdSeconds;

        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;

        System.out.printf("%d:%02d", minutes, seconds);

    }
}
