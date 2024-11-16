package ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());

        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddiesCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        double sumAll = (puzzleCount * 2.60) + (dollsCount * 3.0) + (teddiesCount * 4.10) +
                (minionsCount * 8.20) + (trucksCount * 2.0);

        int toysCountAll = puzzleCount + dollsCount + teddiesCount + minionsCount + trucksCount;

        if (toysCountAll >= 50) {
            sumAll = sumAll - (sumAll * 0.25);
        }

        sumAll = sumAll - (sumAll * 0.10);

        if (sumAll >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", sumAll - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(sumAll - tripPrice));
        }

    }
}
