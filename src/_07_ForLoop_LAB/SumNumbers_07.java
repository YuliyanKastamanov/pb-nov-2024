package _07_ForLoop_LAB;

import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //прочитаме числото n -> броя повторения на нашия цикъл -> броя числа, които трябва да прочитаме от конзолата
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            //прочитаме число от конзолата
            int currentNumber = Integer.parseInt(scanner.nextLine());

            sum += currentNumber; // sum = sum + currentNumber

        }

        System.out.println(sum);

    }
}
