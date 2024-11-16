package ConditionalStatements_EXERCISE;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        double bonus = 0.0;

        if (num <= 100) {
            bonus = 5.0;
        } else if (num <= 1000) {
            bonus = 0.20 * num;
        } else if (num > 1000) {
            bonus = 0.10 * num;
        }

        //o	За четно число  + 1 т.
        //o	За число, което завършва на 5  + 2 т.

        if (num % 2 == 0) {
            bonus = bonus + 1;
        } else if (num % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(bonus + num);
    }
}
