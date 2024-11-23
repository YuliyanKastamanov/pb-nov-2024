package _07_ForLoop_LAB;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbersInGroup = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= 2 * countNumbersInGroup ; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());
            if(i <= countNumbersInGroup){
                sumLeft += currentNumber;
            }else {
                sumRight += currentNumber;
            }

        }

        if(sumLeft == sumRight){
            System.out.printf("Yes, sum = %d", sumLeft);
        }else {
            int diff = Math.abs(sumLeft - sumRight);
            System.out.printf("No, diff = %d", diff);
        }


    }
}
