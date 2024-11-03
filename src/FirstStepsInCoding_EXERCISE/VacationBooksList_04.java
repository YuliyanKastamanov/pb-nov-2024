package FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class VacationBooksList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allPages = Integer.parseInt(scanner.nextLine());
        int pagesFor1Hour = Integer.parseInt(scanner.nextLine());
        int allDays = Integer.parseInt(scanner.nextLine());

        int allHoursToRead = allPages / pagesFor1Hour;

        int hoursPerDay = allHoursToRead / allDays;

        System.out.println(hoursPerDay);
    }
}
