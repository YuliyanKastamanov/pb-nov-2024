package _11_NestedLoops_LAB;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double neededMoney = Double.parseDouble(scanner.nextLine());

            double savings = 0;

            while (neededMoney > savings){
                double currentMoney = Double.parseDouble(scanner.nextLine());
                savings += currentMoney;
            }

            System.out.printf("Going to %s!%n", destination);


            destination = scanner.nextLine();
        }
    }
}
