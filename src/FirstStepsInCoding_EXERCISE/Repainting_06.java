package FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plasticCount = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int hoursWorkers = Integer.parseInt(scanner.nextLine());

        double plasticPrice = 1.50 * (plasticCount + 2);
        double paintPrice = 14.50 * (paintLiters + (paintLiters * 0.10));
        double thinnerPrice = 5.00 * thinnerLiters;

        double sumAll = plasticPrice + paintPrice + thinnerPrice + 0.40;

        double priceWorkersForHour = 0.30 * sumAll;
        double sumAllWorkers = priceWorkersForHour * hoursWorkers;

        System.out.println(sumAll + sumAllWorkers);
    }
}
