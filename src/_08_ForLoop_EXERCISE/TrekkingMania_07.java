package _08_ForLoop_EXERCISE;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());

        int musalaPercent = 0;
        int monblancPercent = 0;
        int kilimandjaroPercent = 0;
        int k2Percent = 0;
        int everestPercent = 0;

        int allPeopleCount = 0;

        for (int i = 1; i <= groupsCount; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            allPeopleCount += peopleInGroup;

            if (peopleInGroup <= 5) {
                musalaPercent += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblancPercent += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimandjaroPercent += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2Percent += peopleInGroup;
            } else {
                everestPercent += peopleInGroup;
            }
        }

        System.out.printf("%.2f%%%n", 1.0 * musalaPercent / allPeopleCount * 100);
        System.out.printf("%.2f%%%n", 1.0 * monblancPercent / allPeopleCount * 100);
        System.out.printf("%.2f%%%n", 1.0 * kilimandjaroPercent / allPeopleCount * 100);
        System.out.printf("%.2f%%%n", 1.0 * k2Percent / allPeopleCount * 100);
        System.out.printf("%.2f%%", 1.0 * everestPercent / allPeopleCount * 100);

    }
}
