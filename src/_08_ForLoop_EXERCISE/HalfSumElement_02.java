package _08_ForLoop_EXERCISE;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 1 - n  -> step 1

        int sum = 0;
        int maxNumber = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            sum = sum + number;
            //sum += number;

            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        sum = sum - maxNumber;

        if (sum == maxNumber) {
            System.out.printf("Yes%nSum = %d", sum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - maxNumber));
        }

    }
}
