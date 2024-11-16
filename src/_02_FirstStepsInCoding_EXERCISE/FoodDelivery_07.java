package _02_FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int vegetarianMenuCount = Integer.parseInt(scanner.nextLine());

        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.

        double totalSum = (chickenMenuCount * 10.35) + (fishMenuCount * 12.40) + (vegetarianMenuCount * 8.15);
        double dessertPrice = totalSum * 0.20;
        double finalSum = totalSum + dessertPrice + 2.50;

        System.out.println(finalSum);
    }
}
