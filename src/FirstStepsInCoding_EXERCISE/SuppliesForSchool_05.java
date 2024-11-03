package FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        //• Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)

        double pensPrice = 5.80 * pensCount;
        double markersPrice = 7.20 * markersCount;
        double detergentPrice = 1.20 * detergentLiters;

        double totalSum = pensPrice + markersPrice + detergentPrice;

        double discountMoney = (discountPercent/100.0) * totalSum;
        totalSum = totalSum - discountMoney;

        System.out.println(totalSum);
    }
}
