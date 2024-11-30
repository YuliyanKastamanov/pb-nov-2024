package _09_WhileLoop_LAB;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        double sum = 0;

        while (!input.equals("NoMoreMoney")){

            //щом сме в while -> имаме въведена сума, която да добавим
            double currentSum = Double.parseDouble(input);//"5.45" -> 5.45

            if(currentSum < 0){
                System.out.println("Invalid operation!");
                break;
            }else {
                sum += currentSum;
                System.out.printf("Increase: %.2f%n", currentSum);
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", sum);


    }
}
