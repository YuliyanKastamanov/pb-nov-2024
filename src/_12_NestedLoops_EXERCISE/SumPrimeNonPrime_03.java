package _12_NestedLoops_EXERCISE;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;

        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);

            if (number < 0) {
                System.out.println("Number is negative.");
            } else {
                int dividersCount = 0;

                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        dividersCount++;
                    }
                }

                if (dividersCount > 2) {
                    sumNonPrime += number;
                } else {
                    sumPrime += number;
                }
            }

            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n" +
                "Sum of all non prime numbers is: %d%n", sumPrime, sumNonPrime);

    }
}
