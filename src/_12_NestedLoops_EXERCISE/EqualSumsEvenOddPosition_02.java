package _12_NestedLoops_EXERCISE;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        for (int i = n1; i <= n2; i++) {
            int currentNum = i;
            int sumEven = 0;
            int sumOdd = 0;

            for (int j = 0; j <= 5; j++) {
                int lastDigit = currentNum % 10;
                currentNum = currentNum / 10;

                if (j % 2 == 0) {
                    sumEven += lastDigit;
                } else {
                    sumOdd += lastDigit;
                }
            }

            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }

        }

    }
}
