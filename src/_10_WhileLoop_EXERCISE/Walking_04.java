package _10_WhileLoop_EXERCISE;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;

        while (goal > 0) {
            String command = scanner.nextLine();

            if (command.equals("Going home")) {
                int steps = Integer.parseInt(scanner.nextLine());
                goal -= steps;
                break;
            }

            int steps = Integer.parseInt(command);

            goal -= steps;
        }

        if (goal > 0) {
            System.out.printf("%d more steps to reach goal.", goal);
        } else {
            System.out.printf("Goal reached! Good job!%n" +
                    "%d steps over the goal!", Math.abs(goal));
        }
    }
}
