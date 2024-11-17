package _06_ConditionalStatementsAdvanced_EXERCISE;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int allSeats = rows * columns;

        double finalSum = 0.0;
        switch (movieType) {
            case "Premiere" -> finalSum = 12.0 * allSeats;
            case "Normal" -> finalSum = 7.50 * allSeats;
            case "Discount" -> finalSum = 5.0 * allSeats;
        }

        System.out.printf("%.2f leva", finalSum);

    }
}
