package _07_FoorLoop_LAB;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countNumber = Integer.parseInt(scanner.nextLine());

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= countNumber ; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            /*if(i == 1){
                minNumber = currentNumber;
                maxNumber = currentNumber;
            }*/

            if(currentNumber <= minNumber){
                minNumber = currentNumber;
            }

            if (currentNumber >= maxNumber){
                maxNumber = currentNumber;
            }
        }

        System.out.printf("Max number: %d%n", maxNumber);
        System.out.printf("Min number: %d%n", minNumber);


    }
}
