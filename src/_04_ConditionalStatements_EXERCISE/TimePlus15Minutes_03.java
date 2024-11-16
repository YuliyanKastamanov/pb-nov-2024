package _04_ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 15;

        if (minutes >= 60) {
            minutes = minutes - 60;
            hours = hours + 1;
        }

        if (hours > 23) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);
    }
}
