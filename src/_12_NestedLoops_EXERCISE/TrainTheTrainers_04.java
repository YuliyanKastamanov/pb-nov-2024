package _12_NestedLoops_EXERCISE;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juryCount = Integer.parseInt(scanner.nextLine());

        double sumAllGrades = 0.0;
        int countAllGrades = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String namePresentation = command;
            double gradesSum = 0.0;

            for (int i = 1; i <= juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());

                gradesSum += grade;
                sumAllGrades += grade;
                countAllGrades++;
            }

            System.out.printf("%s - %.2f.%n", namePresentation, gradesSum / juryCount);
            command = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", sumAllGrades / countAllGrades);

    }
}
