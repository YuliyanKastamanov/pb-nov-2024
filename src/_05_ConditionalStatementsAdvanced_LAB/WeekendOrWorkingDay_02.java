package _05_ConditionalStatementsAdvanced_LAB;

import java.util.Scanner;

public class WeekendOrWorkingDay_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме ден от седмицата като текст
        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Working day");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Error");
        }
    }
}
