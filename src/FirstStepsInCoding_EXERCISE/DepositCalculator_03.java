package FirstStepsInCoding_EXERCISE;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositDue = Integer.parseInt(scanner.nextLine());
        double annualFee = Double.parseDouble(scanner.nextLine());

        // сума = депозирана сума  + срок на депозита *
        // ((депозирана сума * годишен лихвен процент ) / 12)

        double monthlyInterest = (depositSum * (annualFee/100)) / 12;

        double sum = depositSum + depositDue * monthlyInterest;

        System.out.println(sum);
    }
}
