package _03_ConditionalStatements_LAB;

import java.util.Scanner;

public class ExcellentResult_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());

        // grade >= 5
        //Excellent!

        if (grade >= 5) {
            System.out.println("Excellent!");
        }

    }
}
